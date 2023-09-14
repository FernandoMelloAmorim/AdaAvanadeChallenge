package com.SpringWarriors.AdaAvanadeChallenge.repositories;

import com.SpringWarriors.AdaAvanadeChallenge.entities.Battle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BattleRepository extends JpaRepository <Battle, Long> {
}
