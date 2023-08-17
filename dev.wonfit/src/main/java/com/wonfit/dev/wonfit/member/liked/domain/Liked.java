package com.wonfit.dev.wonfit.member.liked.domain;

import com.wonfit.dev.wonfit.member.member.domain.Member;
import com.wonfit.dev.wonfit.product.product.domain.Product;
import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
@Table(name = "liked")
public class Liked {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;
}
