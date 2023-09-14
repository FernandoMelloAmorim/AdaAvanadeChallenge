package com.SpringWarriors.AdaAvanadeChallenge.controllers;

import com.SpringWarriors.AdaAvanadeChallenge.entities.Battle;
import com.SpringWarriors.AdaAvanadeChallenge.services.BattleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/battleRecord")
public class BattleRecordController {

    @Autowired
    private BattleService service;

    @GetMapping
    public ResponseEntity<List<Battle>> findAll() {
        List<Battle> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Battle> findById(@PathVariable Long id) {
        Battle obj  = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

    @PostMapping
    public ResponseEntity<Battle> insert(@RequestBody Battle obj){
        obj = service.insert(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
        return ResponseEntity.created(uri).body(obj);
    }
}