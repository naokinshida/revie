package com.example.nagoyameshi.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.nagoyameshi.entity.Memberinfo;
import com.example.nagoyameshi.entity.Review;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Integer> {
    public List<Review> findByMemberinfoOrderByCreatedAtDesc(Memberinfo memberinfo, Pageable pageable);
}


	




