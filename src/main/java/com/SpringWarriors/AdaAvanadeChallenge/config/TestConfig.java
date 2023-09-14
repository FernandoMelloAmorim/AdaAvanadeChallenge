package com.SpringWarriors.AdaAvanadeChallenge.config;

import com.SpringWarriors.AdaAvanadeChallenge.entities.Hero;
import com.SpringWarriors.AdaAvanadeChallenge.entities.Monster;
import com.SpringWarriors.AdaAvanadeChallenge.repositories.HeroRepository;
import com.SpringWarriors.AdaAvanadeChallenge.repositories.MonsterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private HeroRepository heroRepository;

    @Autowired
    private MonsterRepository monsterRepository;

    @Override
    public void run(String... args) throws Exception {
        Hero h1 = new Hero(null,"Guerreiro", 20, 7, 5, 6, 1, 12);
        Hero h2 = new Hero(null,"Bárbaro", 21, 10, 2, 5, 2, 8);
        Hero h3 = new Hero(null,"Cavaleiro", 26, 6, 8, 3, 2, 6);

        heroRepository.saveAll(Arrays.asList(h1,h2,h3));

        Monster m1 = new Monster(null,"Orc", 42, 7, 1, 2, 3, 4);
        Monster m2 = new Monster(null,"Gigante", 34, 10, 4, 4, 2, 6);
        Monster m3 = new Monster(null,"Lobisomen", 34, 7, 4, 7, 2, 4);

        monsterRepository.saveAll(Arrays.asList(m1,m2,m3));
    }
}
