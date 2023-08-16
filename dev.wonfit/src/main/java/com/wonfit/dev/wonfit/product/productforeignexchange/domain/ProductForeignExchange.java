package com.wonfit.dev.wonfit.product.productforeignexchange.domain;

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
@Table(name = "product_foreign_exchange")
public class ProductForeignExchange {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "product_type")
    private double conversionRateInfo; // 환율 정보

    @Column(name = "product_currency")
    private String depositCurrency; // 예치 통화

    @Column(name = "target")
    private String target; // 가입 대상

    @Column(name = "product_interest_rate")
    private double subAmount; // 가입 금액

    @Column(name = "sub_period_year")
    private int subPeriodYear; // 가입 기간

    @Column(name = "status")
    private String status; // 상태

}
