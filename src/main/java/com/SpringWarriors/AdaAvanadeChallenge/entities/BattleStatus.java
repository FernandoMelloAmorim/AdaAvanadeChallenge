package com.SpringWarriors.AdaAvanadeChallenge.entities;

public enum BattleStatus {

    FIGHTING(1),
    ENDED(2);

    private int code;

    private BattleStatus(int code) {

    }

    public int getCode(){
        return code;
    }

    public static  BattleStatus valueOf(int code){
        for (BattleStatus value : BattleStatus.values()){
            if (value.getCode() == code){
                return value;
            }
        }
        throw new IllegalArgumentException("Invalid BattleStatus code");
    }
}
