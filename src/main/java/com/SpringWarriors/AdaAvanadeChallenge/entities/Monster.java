package com.SpringWarriors.AdaAvanadeChallenge.entities;

import jakarta.persistence.*;

import java.io.Serial;

@Entity
public class Monster extends Character {
    @Serial
    private static final long serialVersionUID = -7094424639286357355L;
    public Monster(Long id, String name, int hitPoints, int strength, int defense, int dexterity, int diceAmount, int diceFaces) {
        super(id, name, hitPoints, strength, defense, dexterity, diceAmount, diceFaces);
    }

    public Monster() {

    }
}
