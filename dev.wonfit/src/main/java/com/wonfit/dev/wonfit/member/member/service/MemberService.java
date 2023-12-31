package com.wonfit.dev.wonfit.member.member.service;


import com.wonfit.dev.wonfit.member.member.domain.JwtUtil;
import com.wonfit.dev.wonfit.member.member.domain.Member;
import com.wonfit.dev.wonfit.member.member.domain.MemberRepository;
import com.wonfit.dev.wonfit.member.member.dto.MemberDto;
import com.wonfit.dev.wonfit.member.member.dto.MemberRegisterRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;
    @Value("${jwt.token.secret}")
    private String secretkey;
    private final long expireTimeMs = 1000 * 60 * 60 * 24 * 7; // 토큰 7일

    public MemberDto register(MemberRegisterRequest request) {
        memberRepository.findByMemberLoginId(request.getMemberLoginId())
                .ifPresent(member -> {
                    throw new RuntimeException();
                });

        Member saveMember = memberRepository.save(request.toEntity(bCryptPasswordEncoder.encode(request.getMemberPw())));
        return MemberDto.fromEntity(saveMember);
    }

    public String login(String memberId, String memberPw) {
        Member member = memberRepository.findByMemberLoginId(memberId)
                .orElseThrow(() -> new RuntimeException("가입되지 않은 사원입니다."));

        if (!bCryptPasswordEncoder.matches(memberPw, member.getMemberPw())) {
            throw new RuntimeException("비밀번호가 일치하지 않습니다.");
        }

        return JwtUtil.createToken(memberId, expireTimeMs);
    }
}
