package com.SpringWarriors.AdaAvanadeChallenge.repository;

import com.SpringWarriors.AdaAvanadeChallenge.model.Hero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HeroRepository extends JpaRepository<Hero, Long> {
}
