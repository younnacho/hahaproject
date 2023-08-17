package com.wonfit.dev.wonfit.member.membersearchlog.domain;

import com.wonfit.dev.wonfit.member.member.domain.Member;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;


@Entity
@Getter
@Table (name = "member_search_log")
public class MemberSearchLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;

    @Column(name = "search_word")
    private String searchWord; // 검색어

    @Column(name = "search_date")
    private LocalDateTime searchDate; // 검색 날짜 및 시간

    @Column(name = "search_url")
    private String searchUrl; // 검색 결과 URL
}
