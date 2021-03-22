package com.example.demo.repository;

import com.example.demo.entity.News;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewsRep extends JpaRepository<News,Long> {
}
