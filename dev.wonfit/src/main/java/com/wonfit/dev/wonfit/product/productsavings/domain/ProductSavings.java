package com.wonfit.dev.wonfit.product.productsavings.domain;

import com.wonfit.dev.wonfit.product.product.domain.Product;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
public class ProductSavings {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @Column(name = "product_savings_name")
    private String productSavingsName;

    @Column(name = "product_target")
    private String productTarget; // 가입 대상

    @Column(name = "product_max_deposit")
    private double productMaxDeposit; // 최대 월 납입 금액

    @Column(name = "product_savings_period")
    private String productSavingsPeriod; // 가입 기간

    @Column(name = "basic_interest_rate")
    private double basicInterestRate; // 기본 금리

    @Column(name = "preferential_interest_rate")
    private double preferentialInterestRate; // 우대금리

    @Column(name = "product_savings_desc")
    private String productSavingsDesc; // 상품 설명

    @Column(name = "status")
    private String status; // 상태
}
