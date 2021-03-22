package com.example.demo.controller;

import com.example.demo.entity.News;
import com.example.demo.service.NService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {
    private final NService newsService;

    @Autowired
    public Controller(NService newsService){
        this.newsService = newsService;
    }

//    @PostMapping(value = "/api/news")
//    public ResponseEntity<?> create(@RequestBody News news){
//        NewsService.create(news);
//        return new ResponseEntity<>(HttpStatus.CREATED);
//    }

    @GetMapping(value = "/api/news")
    public ResponseEntity<List<News>> findAll(){
        final List<News> newsList = NService.findAll();

        return newsList != null && !newsList.isEmpty()
                ? new ResponseEntity<>(newsList, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

//    @GetMapping(value = "/api/persons/{id}")
//    public ResponseEntity<Person> find(@PathVariable(name="id") Long id){
//        final Person person = personService.find(id);
//
//        return person != null
//                ? new ResponseEntity<>(person, HttpStatus.OK)
//                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
//    }
}