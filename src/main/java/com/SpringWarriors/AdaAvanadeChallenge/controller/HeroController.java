package com.SpringWarriors.AdaAvanadeChallenge.controller;

import com.SpringWarriors.AdaAvanadeChallenge.model.Hero;
import com.SpringWarriors.AdaAvanadeChallenge.service.HeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/heroes")
public class HeroController {

    @Autowired
    private HeroService heroService;

    @PostMapping
    public Hero createHero(@RequestBody Hero hero){
        return heroService.createHero(hero);
    }

    @GetMapping
    public ResponseEntity<List<Hero>> findAll() {
        List<Hero> list = heroService.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping("{id}")
    public ResponseEntity<Hero> findById(@PathVariable Long id) {
        Hero obj = heroService.findById(id);
        return ResponseEntity.ok().body(obj);
    }

 }
