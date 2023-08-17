package com.wonfit.dev.wonfit.product.productdeposit.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import com.wonfit.dev.wonfit.product.product.domain.Product;

import javax.persistence.*;

@Entity
@Getter
@Table(name = "product_deposit")
public class ProductDeposit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @Column(name = "product_deposit_name")
    private String productDepositName;

    @Column(name = "product_min_deposit")
    private int productMinDeposit; // 최소 가입금액

    @Column(name = "product_target")
    private String productTarget; // 가입 대상

    @Column(name = "product_deposit_period")
    private String productDepositPeriod; // 가입기간

    @Column(name = "basic_interest_rate")
    private double basicInterestRate; // 기본 금리

    @Column(name = "product_deposit_desc")
    private String productDepositDesc; // 상품 설명


}
