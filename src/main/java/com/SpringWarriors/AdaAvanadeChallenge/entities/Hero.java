package com.SpringWarriors.AdaAvanadeChallenge.entities;

import jakarta.persistence.*;

import java.io.Serial;


@Entity
public class Hero extends Character {
    @Serial
    private static final long serialVersionUID = 7969735144145646628L;

    public Hero(Long id, String name, int hitPoints, int strength, int defense, int dexterity, int diceAmount, int diceFaces) {
        super(id, name, hitPoints, strength, defense, dexterity, diceAmount, diceFaces);
    }

    public Hero() {

    }
}
