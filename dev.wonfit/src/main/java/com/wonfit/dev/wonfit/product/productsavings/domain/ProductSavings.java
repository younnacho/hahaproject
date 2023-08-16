package com.wonfit.dev.wonfit.product.productsavings.domain;

import com.wonfit.dev.wonfit.product.product.domain.Product;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
public class ProductSavings {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @Column(name = "product_savings_name")
    private String productSavingsName;

    @Column(name = "target")
    private String target; // 가입 대상

    @Column(name = "max_deposit")
    private double maxDeposit; // 최대 예치금

    @Column(name = "available_period")
    private String availablePeriod; // 가입 기간

    @Column(name = "basic_interest_rate")
    private double basicInterestRate; // 기본 금리

    @Column(name = "preferential_interest_rate")
    private double preferentialInterestRate; // 우대금리

    @Column(name = "status")
    private String status; // 상태
}
