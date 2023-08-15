package com.wonfit.dev.wonfit.repository;


import com.wonfit.dev.wonfit.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
    Optional<Member> findByEmployName(String employName);
}
