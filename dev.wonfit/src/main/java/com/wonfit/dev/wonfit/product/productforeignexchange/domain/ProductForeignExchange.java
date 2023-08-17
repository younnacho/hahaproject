package com.wonfit.dev.wonfit.product.productforeignexchange.domain;

import com.wonfit.dev.wonfit.product.product.domain.Product;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Table(name = "product_foreign_exchange")
public class ProductForeignExchange {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @Column(name = "product_foreign_exchange_name")
    private String productForeignExchangeName;

    @Column(name = "product_target")
    private String productTarget; // 가입 대상

    @Column(name = "product_type")
    private double conversionRateInfo; // 환율 정보

    @Column(name = "product_currency")
    private String depositCurrency; // 예치 통화

    @Column(name = "product_foreign_exchange_period")
    private String productForeignExchangePeriod; // 가입 기간

    @Column(name = "product_savings_desc")
    private String productSavingsDesc; // 상품 설명

    @Column(name = "status")
    private String status; // 상태

}
