package com.SpringWarriors.AdaAvanadeChallenge.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

@Data
@Entity
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class Hero implements Serializable {
    @Serial
    private static final long serialVersionUID = 7969735144145646628L;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hero obj = (Hero) o;
        return Objects.equals(id, obj.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
