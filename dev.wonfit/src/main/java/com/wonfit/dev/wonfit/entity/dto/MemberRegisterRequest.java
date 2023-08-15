package com.wonfit.dev.wonfit.entity.dto;


import com.wonfit.dev.wonfit.entity.Member;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
public class MemberRegisterRequest {
    private String employNumber;
    private String employName;
    private String phoneNumber;
    private String password;
    private String adminKey;

    public Member toEntity(String password) {
        return Member.builder()
                .employNumber(this.employNumber)
                .employName(this.employName)
                .phoneNumber(this.phoneNumber)
                .password(password)
                .adminKey(this.adminKey)
                .build();
    }
}