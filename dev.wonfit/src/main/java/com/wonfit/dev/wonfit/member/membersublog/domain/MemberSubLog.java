package com.wonfit.dev.wonfit.member.membersublog.domain;

import com.wonfit.dev.wonfit.member.member.domain.Member;
import com.wonfit.dev.wonfit.product.product.domain.Product;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import net.bytebuddy.asm.Advice;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Table(name = "member_sub_log")
public class MemberSubLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product productId; // 상품 아이디

    @Column(name = "sub_date")
    private LocalDateTime subDate; // 가입 날짜

    @Column(name = "maturity")
    private LocalDateTime maturity; // 만료 날짜

    @Column(name = "savings_amount", nullable = true)
    private double savingsAmount; // 정기 적금 납입 금액

    @Column(name = "subscription_amount")
    private double subscriptionAmount; // 금융 상품 가입 시 예금 금액

    @Column(name = "interest_rate")
    private double interestRate; // 금융 상품 가입 시 금리

    @Enumerated(EnumType.STRING)
    @Column(name = "sub_status")
    private SubStatus subStatus; // 가입 상태(가입 중, 만료, 해지 등)
}
