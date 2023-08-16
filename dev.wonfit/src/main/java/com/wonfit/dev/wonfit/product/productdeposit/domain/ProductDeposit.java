package com.wonfit.dev.wonfit.product.productdeposit.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import com.wonfit.dev.wonfit.product.product.domain.Product;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
public class ProductDeposit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @Column(name = "product_deposit_name")
    private String productDepositName;

    @Column(name = "product_deposit_price")
    private int productDepositPrice; // 가입금액

    @Column(name = "target")
    private String target; // 가입대상

    @Column(name = "product_deposit_period")
    private int productDepositPeriod; // 가입기간

    @Column(name = "product_deposit_interest_rate")
    private double productDepositInterestRate; // 예금 금리

    @Column(name = "product_deposit_desc")
    private String productDepositDesc; // 상품 설명


}
