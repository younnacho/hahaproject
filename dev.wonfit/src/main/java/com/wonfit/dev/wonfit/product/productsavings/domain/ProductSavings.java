package com.wonfit.dev.wonfit.product.productsavings.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class ProductSavings {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
