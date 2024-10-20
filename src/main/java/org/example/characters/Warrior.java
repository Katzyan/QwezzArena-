package org.example.characters;

public class Warrior extends MainCharacter implements WarriorAbilities{

    /**
     * Warriors are balanced in terms of HP and damage.
     *
     * Base HP 50 -> +10 per level
     * Base Damage 10 -> +2 per level
     * Base Crit 5% -> +1% per level
     *
     */




    public Warrior(String name, String classType, int maxHP, int baseDamage, int crit, int regen, String armorTypeAccepted, int gold){
        super(name, classType, maxHP, baseDamage, crit, regen, armorTypeAccepted, gold);
    }

    @Override
    public void setMaxHP() {
        this.maxHP = 50 + getLevel()*10;
    }

    @Override
    public void setBaseDamage(){
        this.baseDamage = 10 + getLevel()*2;
    }

    @Override
    public void setCrit() {
        this.crit = 5 + getLevel();
        if(getCrit() > 100){
            this.crit = 100;
        }
    }


}
