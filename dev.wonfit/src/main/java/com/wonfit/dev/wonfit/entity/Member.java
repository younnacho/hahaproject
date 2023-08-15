package com.wonfit.dev.wonfit.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
@Entity
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "employnumber", unique = true)
    private String employNumber;

    @Column(name = "employname")
    private String employName;

    @Column(name = "phonenumber")
    private String phoneNumber;

    private String password;

    @Column(name = "adminkey")
    private String adminKey;
}