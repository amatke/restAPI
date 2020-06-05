package com.matovic.restapi.controllers;

import com.matovic.restapi.models.entities.Page;
import com.matovic.restapi.models.entities.PageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/pages", produces = "application/json")
@CrossOrigin(origins = "*")        // bilo koji domen moze da pristupi
public class PageRestController {

    @Autowired
    private PageRepository pageRepository;

    @GetMapping
    public List<Page> getAllPages(){
        return pageRepository.findAll();
    }

    @GetMapping("/{slug}")
    public Page getPageBySlug(@PathVariable(value = "slug") String slug){
        return pageRepository.findBySlug(slug);
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<Page> getPageById(@PathVariable(value = "id") Long id){
        Optional<Page> page = Optional.of(pageRepository.getOne(id));
        if(page.isPresent()){
            return new ResponseEntity<>(page.get(), HttpStatus.OK);
        }
        return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    }

}
