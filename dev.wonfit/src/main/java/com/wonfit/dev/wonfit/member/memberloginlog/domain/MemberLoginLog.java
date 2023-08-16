package com.wonfit.dev.wonfit.member.memberloginlog.domain;

import com.wonfit.dev.wonfit.member.member.domain.Member;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class MemberLoginLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;

    @Column(name = "login_time")
    private LocalDateTime loginTime; // login time
    @Column(name = "login_ip")
    private String loginIp; // login ip
    @Column(name = "login_device")
    private String loginDevice; // login device
    @Column(name = "login_browser")
    private String loginBrowser; // login browser
}
