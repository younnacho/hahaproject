package com.wonfit.dev.wonfit.member.member.domain;


import com.wonfit.dev.wonfit.member.memberinfo.domain.MemberInfo;
import com.wonfit.dev.wonfit.member.memberloginlog.domain.MemberLoginLog;
import com.wonfit.dev.wonfit.member.membersearchlog.domain.MemberSearchLog;
import lombok.*;

import javax.persistence.*;
import javax.persistence.CascadeType;
import java.util.ArrayList;
import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
@Entity
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_id")
    private Long id;

    @Column(name = "member_login_id", length = 10, nullable = false)
    private String memberLoginId; // 회원 아이디 (10자 이하)

    @Column(name = "member_pw", length = 20, nullable = false)
    private String memberPw; // 회원 패스워드 (20자 이하)

    @Column(name = "member_name")
    private String memberName; // 회원 이름

    @Column(name = "member_email")
    private String memberEmail; // 회원 이메일

    @Column(name = "member_registration_number")
    private String memberRegistrationNumber; // 회원 주민번호

    @Column(name = "member_status")
    private boolean status; // 회원 상태(정상, 탈퇴) 휴면 추가할건지?

    @OneToOne(mappedBy = "member_info")
    private MemberInfo memberInfo;

    @OneToMany(mappedBy = "member")
    private List<MemberInfo> memberInfos = new ArrayList<>();

    @OneToMany(mappedBy = "member")
    private List<MemberLoginLog> memberLoginLogs = new ArrayList<>();

    @OneToMany(mappedBy = "member")
    private List<MemberSearchLog> memberSearchLogs = new ArrayList<>();


// ID: 영문/숫자 10자 이하
// PW: 영문/숫자/특수문자 포함 8자 이상 최대 20자 이하

//    // MemberLoginLog 일대다 관계 설정
//    @OneToMany(mappedBy = "member", cascade = CascadeType.ALL)
//    private List<MemberLoginLog> loginLogs = new ArrayList<>();
//
//    // MemberSearchLog 일대다 관계 설정
//    @OneToMany(mappedBy = "member", cascade = CascadeType.ALL)
//    private List<MemberSearchLog> searchLogs = new ArrayList<>();
//
//    // memberSubLog 일대다 관계 설정
//    @OneToMany(mappedBy = "member", cascade = CascadeType.ALL)
//    private List<MemberSubLog> subLogs = new ArrayList<>();
//
//    // Member - Product 다대다 관계 설정
//    @ManyToMany
//    @JoinTable(
//            name = "member_product",  // 연결 테이블 이름
//            joinColumns = @JoinColumn(name = "member_id"),  // Member 엔티티의 외래 키
//            inverseJoinColumns = @JoinColumn(name = "product_id")  // Product 엔티티의 외래 키
//    )
//    private List<Product> products = new ArrayList<>();
}
