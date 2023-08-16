package com.wonfit.dev.wonfit.member.member.domain;


import lombok.*;

import javax.persistence.*;



@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
@Entity
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "member_login_id")
    private String memberLoginId; // 회원 아이디

    @Column(name = "MemberPw")
    private String memberPw; // 회원 패스워드
    @Column(name = "MemberEmail")
    private String memberEmail; // 회원 이메일
    @Column(name = "MemberName")
    private String memberName; // 회원 이름
    @Column(name = "MemberStatus")
    private boolean status; // 회원 상태



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
