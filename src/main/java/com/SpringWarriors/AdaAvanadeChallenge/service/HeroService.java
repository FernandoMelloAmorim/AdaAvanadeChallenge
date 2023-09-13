package com.SpringWarriors.AdaAvanadeChallenge.service;

import com.SpringWarriors.AdaAvanadeChallenge.model.Hero;
import com.SpringWarriors.AdaAvanadeChallenge.repository.HeroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HeroService {

    private HeroRepository heroRepository;

    public List<Hero> findAll() {
        return heroRepository.findAll();
    }

    public Hero findById(Long id) {
        Optional<Hero> obj = heroRepository.findById(id);
        return obj.get();
    }

    public Hero createHero(Hero hero) {

    }
}
