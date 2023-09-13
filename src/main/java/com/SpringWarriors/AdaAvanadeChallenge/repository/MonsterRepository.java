package com.SpringWarriors.AdaAvanadeChallenge.repository;

import com.SpringWarriors.AdaAvanadeChallenge.model.Monster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MonsterRepository extends JpaRepository<Monster, Long> {
}
