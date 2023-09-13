package com.SpringWarriors.AdaAvanadeChallenge.model;

import jakarta.persistence.*;
import lombok.Data;
import org.antlr.v4.runtime.misc.NotNull;

import java.io.Serializable;
import java.util.Objects;

@Entity
@Data
public class BattleRecord implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String play;

    @NotNull
    private String enemy;

    @NotNull
    private String firstToStrike;

    @NotNull
    private int turnNumber;

    @NotNull
    private int attackValue;

    @NotNull
    private int defenseValue;

    @NotNull
    private int damageCaused;

    public BattleRecord(){

    }

    public BattleRecord(String play, String enemy, String firstToStrike, int turnNumber, int attackValue, int defenseValue, int damageCaused) {
        this.play = play;
        this.enemy = enemy;
        this.firstToStrike = firstToStrike;
        this.turnNumber = turnNumber;
        this.attackValue = attackValue;
        this.defenseValue = defenseValue;
        this.damageCaused = damageCaused;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BattleRecord that = (BattleRecord) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
