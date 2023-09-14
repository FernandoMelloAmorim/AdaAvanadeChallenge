package com.SpringWarriors.AdaAvanadeChallenge.repositories;

import com.SpringWarriors.AdaAvanadeChallenge.entities.Hero;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HeroRepository extends JpaRepository<Hero, Long> {
}
