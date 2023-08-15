package com.wonfit.dev.wonfit.member.member.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class MemberLoginRequest {
    private String MemberId;
    private String MemberPw;
}