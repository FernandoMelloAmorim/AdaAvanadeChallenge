package com.SpringWarriors.AdaAvanadeChallenge.entities;

import com.SpringWarriors.AdaAvanadeChallenge.services.HeroService;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.antlr.v4.runtime.misc.NotNull;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

@Data
@Entity
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class Battle implements Serializable {
    @Serial
    private static final long serialVersionUID = 869886662353484250L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String player;

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

    @NotNull
    private int battleStatus;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Battle that = (Battle) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
