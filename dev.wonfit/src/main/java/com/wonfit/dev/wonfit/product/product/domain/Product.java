package com.wonfit.dev.wonfit.product.product.domain;

import com.wonfit.dev.wonfit.member.memberliked.domain.MemberLiked;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name ="product_name")
    private String productName;

    @Column(name ="interest_rate")
    private double interestRate;

    @Column(name ="attribute")
    private String attribute;

    @Column(name ="sorting_options")
    private String sortingOptions;

    @Column(name ="sub_product_info")
    private String subProductInfo;

    @ManyToOne
    @JoinColumn(name = "memberLiked_Id")
    private MemberLiked memberLiked;


}
