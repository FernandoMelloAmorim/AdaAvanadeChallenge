package com.SpringWarriors.AdaAvanadeChallenge.repositories;

import com.SpringWarriors.AdaAvanadeChallenge.entities.BattleRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BattleRecordRepository extends JpaRepository <BattleRecord, Long> {
}
