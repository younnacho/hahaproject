package com.wonfit.dev.wonfit.member.memberliked.domain;

import com.wonfit.dev.wonfit.member.member.domain.Member;
import com.wonfit.dev.wonfit.product.product.domain.Product;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class MemberLiked {
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
