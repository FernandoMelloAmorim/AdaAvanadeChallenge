package com.SpringWarriors.AdaAvanadeChallenge.controllers;

import com.SpringWarriors.AdaAvanadeChallenge.entities.Hero;
import com.SpringWarriors.AdaAvanadeChallenge.services.HeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/heroes")
public class HeroController {

    @Autowired
    private HeroService service;

    @GetMapping
    public ResponseEntity<List<Hero>> findAll() {
        List<Hero> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Hero> findById(@PathVariable Long id) {
        Hero obj  = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

    @PostMapping
    public ResponseEntity<Hero> insert(@RequestBody Hero obj){
        obj = service.insert(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
        return ResponseEntity.created(uri).body(obj);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return  ResponseEntity.noContent().build();
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Hero> update(@PathVariable Long id, @RequestBody Hero obj){
        obj = service.update(id, obj);
        return ResponseEntity.ok().body(obj);
    }
 }