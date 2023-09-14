package com.SpringWarriors.AdaAvanadeChallenge.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/battle")
public class BattleController {

    @GetMapping(value = "/checkInitiative")
    public String CheckInitiative () {
        String firstToStrike = null;
        int playerResult = RollDice(20);
        System.out.println("O jogador rolou o dado e tirou: " + playerResult);
        int enemyResult = RollDice(20);
        System.out.println("O inimigo rolou o dado e tirou: " + enemyResult);

        if (playerResult > enemyResult){
            firstToStrike = "Jogador";
            System.out.println("O jogador inicia o turno de combate!");
        } else if (playerResult < enemyResult) {
            firstToStrike = "Inimigo";
            System.out.println("O inimigo inicia o turno de combate!");
        } else {
            System.out.println("Empate! Role os dados novamente!");
            CheckInitiative();
        }
        return firstToStrike;
    }

    @GetMapping(value = "/calculateAttack")
    public int CalculateAttack (@RequestParam int strength, int dexterity) {
        return RollDice(12) + strength + dexterity;
    }

    @GetMapping(value = "/calculateDefense")
    public int CalculateDefense (@RequestParam int defense, int dexterity) {
        return RollDice(12) + defense + dexterity;
    }

    @GetMapping(value = "/attackAction")
    public int AttackAction(@RequestParam int attackerStrength, int attackerDexterity, int defenderDefense, int defenderDexterity) {
        int attack = CalculateAttack(attackerStrength, attackerDexterity);
        System.out.println("O atacante rolou o dado e teve o valor: " + attack);
        int defense = CalculateDefense(defenderDefense, defenderDexterity);
        System.out.println("O defensor rolou o dado e teve o valor: " + defense);
        return attack-defense;
    }

    @GetMapping(value = "/calculateDamage")
    public int CalculateDamage (@RequestParam int diceAmount, int diceFaces, int strength) {
        int damage = 0;
        for(int i = 0; i<diceAmount;i++){
            damage += RollDice(diceFaces);
        }
        damage += strength;
        System.out.println("O atacante foi bem sucedido! O valor do dano foi: " + damage);

        return damage;
    }

    @GetMapping(value = "/calculateHP")
    public int CalculateHP(@RequestParam int defenderHP, int damage){
        return defenderHP - damage;
    }

    @GetMapping(value = "/checkHP")
    public int CheckHP(@RequestParam int defenderHP){
        int battleStatus = 0;
        if (defenderHP > 0){
            System.out.println("O defensor ainda possui: " + defenderHP +". A luta seguirá para o próximo turno.");
            battleStatus = 1;
        }
        else {
            System.out.println("O defensor não possui mais vida. FIM DE BATALHA!");
            battleStatus = 2;
        }
        return battleStatus;
    }

    @GetMapping(value = "/rollDice")
    public int RollDice (@RequestParam int diceFaces) {
        return (int) (Math.random() * diceFaces) + 1;
    }

}
