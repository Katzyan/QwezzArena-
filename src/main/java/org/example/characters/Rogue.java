package org.example.characters;

public class Rogue extends MainCharacter{

    /**
     * Rogues have low HP but high damage output, focusing on quick attacks with higher crit chances
     *
     * Base HP 30 -> +5 per level
     * Base Damage 15 -> +3 per level
     * Base Crit 35% -> +3% per level
     *
     */
    public Rogue(String name, String classType, int maxHP, int baseDamage, int crit, int regen){
        super(name, classType, maxHP, baseDamage, crit, regen);

    }

    @Override
    public void setMaxHP() {
        this.maxHP = 30 + getLevel()*5;
    }

    @Override
    public void setBaseDamage(){
        this.baseDamage = 15 + getLevel()*3;
    }

    @Override
    public void setCrit() {
        this.crit = 35 + getLevel()*3;
        if(getCrit() > 100){
            this.crit = 100;
        }
    }
}
