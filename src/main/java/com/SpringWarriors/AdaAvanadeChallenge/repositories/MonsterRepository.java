package com.SpringWarriors.AdaAvanadeChallenge.repositories;

import com.SpringWarriors.AdaAvanadeChallenge.entities.Monster;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MonsterRepository extends JpaRepository<Monster, Long> {
}
