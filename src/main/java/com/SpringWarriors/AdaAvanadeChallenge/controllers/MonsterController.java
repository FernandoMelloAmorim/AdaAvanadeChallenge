package com.SpringWarriors.AdaAvanadeChallenge.controllers;

import com.SpringWarriors.AdaAvanadeChallenge.entities.Monster;
import com.SpringWarriors.AdaAvanadeChallenge.services.MonsterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/monsters")
public class MonsterController {

    @Autowired
    private MonsterService service;

    @GetMapping
    public ResponseEntity<List<Monster>> findAll() {
        List<Monster> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Monster> findById(@PathVariable Long id) {
        Monster obj  = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

    @PostMapping
    public ResponseEntity<Monster> insert(@RequestBody Monster obj){
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
    public ResponseEntity<Monster> update(@PathVariable Long id, @RequestBody Monster obj){
        obj = service.update(id, obj);
        return ResponseEntity.ok().body(obj);
    }
}