package com.SpringWarriors.AdaAvanadeChallenge.model;

import jakarta.persistence.*;

import lombok.Builder;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Data
@Builder
public class Hero implements Serializable {
    @Serial
    private static final long serialVersionUID = 1;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name; //nome
    private int hitPoints; //vida
    private int strength; //força
    private int defense; //defesa
    private int dexterity; //agilidade
    private int diceAmount; //quantidade de dados
    private int diceFaces; //faces do dado

    public Hero(){

    }

    public Hero(String name, int hitPoints, int strength, int defense, int dexterity, int diceAmount, int diceFaces) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.defense = defense;
        this.dexterity = dexterity;
        this.diceAmount = diceAmount;
        this.diceFaces = diceFaces;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hero hero = (Hero) o;
        return Objects.equals(id, hero.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
