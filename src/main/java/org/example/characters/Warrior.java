package org.example.characters;

public class Warrior extends MainCharacter implements WarriorAbilities{

    public Warrior(String name, String classType, int maxHP, int baseDamage, int crit, int regen){
        super(name, classType, maxHP, baseDamage, crit, regen);

    }

    @Override
    public void setMaxHP() {

    }

    @Override
    public void setCrit() {

    }

    @Override
    public void setBaseDamage(){

    }


}
