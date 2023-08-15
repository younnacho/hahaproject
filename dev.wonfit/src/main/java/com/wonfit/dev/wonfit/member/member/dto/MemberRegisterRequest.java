package com.wonfit.dev.wonfit.member.member.dto;


import com.wonfit.dev.wonfit.member.member.domain.Member;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
public class MemberRegisterRequest {
    private String memberId; // 회원 아이디
    private String memberPw; // 회원 패스워드
    private String memberEmail; // 회원 이메일
    private String memberName; // 회원 이름
    private boolean status; // 회원 상태

    public Member toEntity(String password) {
        return Member.builder()
                .memberId(memberId).memberPw(password)
                .memberEmail(memberEmail)
                .memberName(memberName)
                .status(status)
                .build();
    }
}