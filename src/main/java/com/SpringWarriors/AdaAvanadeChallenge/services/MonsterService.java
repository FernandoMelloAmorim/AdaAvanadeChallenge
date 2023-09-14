package com.SpringWarriors.AdaAvanadeChallenge.services;

import com.SpringWarriors.AdaAvanadeChallenge.entities.Monster;
import com.SpringWarriors.AdaAvanadeChallenge.repositories.MonsterRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MonsterService {

    @Autowired
    private MonsterRepository repository;

    public List<Monster> findAll() {
        return repository.findAll();
    }

    public Monster findById(Long id) {
        Optional<Monster> obj = repository.findById(id);
        return obj.get();
    }

    public Monster insert(Monster Monster) {
        return repository.save(Monster);
    }

    public void delete(Long id) {
        repository.deleteById((id));
    }

    public Monster update(Long id, Monster obj) {
        Monster entity = repository.getReferenceById(id);
        updateData(entity, obj);
        return repository.save(entity);
    }

    private void updateData(Monster entity, Monster obj) {
        entity.setName(obj.getName());
        entity.setHitPoints(obj.getHitPoints());
        entity.setStrength((obj.getStrength()));
        entity.setDefense(obj.getDefense());
        entity.setDexterity((obj.getDexterity()));
        entity.setDiceAmount(obj.getDiceAmount());
        entity.setDiceFaces((obj.getDiceFaces()));
    }
}
