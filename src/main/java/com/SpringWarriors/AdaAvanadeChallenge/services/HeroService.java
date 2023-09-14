package com.SpringWarriors.AdaAvanadeChallenge.services;

import com.SpringWarriors.AdaAvanadeChallenge.entities.Hero;
import com.SpringWarriors.AdaAvanadeChallenge.repositories.HeroRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HeroService {

    @Autowired
    private HeroRepository repository;

    public List<Hero> findAll() {
        return repository.findAll();
    }

    public Hero findById(Long id) {
        Optional<Hero> obj = repository.findById(id);
        return obj.get();
    }

    public Hero insert(Hero hero) {
        return repository.save(hero);
    }

    public void delete(Long id) {
        repository.deleteById((id));
    }

    public Hero update(Long id, Hero obj) {
        Hero entity = repository.getReferenceById(id);
        updateData(entity, obj);
        return repository.save(entity);
    }

    private void updateData(Hero entity, Hero obj) {
        entity.setName(obj.getName());
        entity.setHitPoints(obj.getHitPoints());
        entity.setStrength((obj.getStrength()));
        entity.setDefense(obj.getDefense());
        entity.setDexterity((obj.getDexterity()));
        entity.setDiceAmount(obj.getDiceAmount());
        entity.setDiceFaces((obj.getDiceFaces()));
    }
}
