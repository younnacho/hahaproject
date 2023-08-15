package com.wonfit.dev.wonfit.service;


import com.wonfit.dev.wonfit.entity.Member;
import com.wonfit.dev.wonfit.entity.dto.MemberDto;
import com.wonfit.dev.wonfit.entity.dto.MemberRegisterRequest;
import com.wonfit.dev.wonfit.repository.MemberRepository;
import com.wonfit.dev.wonfit.util.JwtUtil;
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
        memberRepository.findByEmployName(request.getEmployName())
                .ifPresent(member -> {
                    throw new RuntimeException();
                });

        Member saveMember = memberRepository.save(request.toEntity(bCryptPasswordEncoder.encode(request.getPassword())));
        return MemberDto.fromEntity(saveMember);
    }

    public String login(String employName, String password) {
        Member member = memberRepository.findByEmployName(employName)
                .orElseThrow(() -> new RuntimeException("가입되지 않은 사원입니다."));

        if (!bCryptPasswordEncoder.matches(password, member.getPassword())) {
            throw new RuntimeException("비밀번호가 일치하지 않습니다.");
        }

        return JwtUtil.createToken(employName, expireTimeMs);
    }
}
