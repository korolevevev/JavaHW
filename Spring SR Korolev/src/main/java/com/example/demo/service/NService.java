package com.example.demo.service;

import com.example.demo.entity.News;
import com.example.demo.repository.NewsRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NService {
    @Autowired
    private NewsRep newsRepository;

    public void create(News news){
        newsRepository.save(news);
    }

    public List<News> findAll(){
        return newsRepository.findAll();
    }

    public News find(Long id){
        return newsRepository.getOne(id);
    }
}
