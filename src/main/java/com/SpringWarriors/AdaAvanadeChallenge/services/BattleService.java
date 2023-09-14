package com.SpringWarriors.AdaAvanadeChallenge.services;

import com.SpringWarriors.AdaAvanadeChallenge.entities.Battle;
import com.SpringWarriors.AdaAvanadeChallenge.entities.Character;
import com.SpringWarriors.AdaAvanadeChallenge.entities.Monster;
import com.SpringWarriors.AdaAvanadeChallenge.repositories.BattleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BattleService {

    @Autowired
    private BattleRepository repository;

    public List<Battle> findAll() { return repository.findAll();
    }

    public Battle findById(Long id) {
        Optional<Battle> obj = repository.findById(id);
        return obj.get();
    }

    public Battle insert(Battle obj) {
        return repository.save(obj);
    }

}
