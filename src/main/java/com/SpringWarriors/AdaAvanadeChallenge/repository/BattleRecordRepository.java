package com.SpringWarriors.AdaAvanadeChallenge.repository;

import com.SpringWarriors.AdaAvanadeChallenge.model.BattleRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BattleRecordRepository extends JpaRepository <BattleRecord, Long> {
}
