package org.example.characters;

public class Worlock extends MainCharacter{
    /**
     * Magesdeal high magical damage but have very low HP.
     * They rely on their damage output and crits to eliminate enemies quickly
     *
     * Base HP 35 -> +8 per level
     * Base Damage 12 -> +3 per level
     * Base Crit 10% -> +2% per level
     *
     */
    public Worlock(String name, String classType, int maxHP, int baseDamage, int crit, int regen, String armorTypeAccepted, int gold){
        super(name, classType, maxHP, baseDamage, crit, regen, armorTypeAccepted, gold);

    }

    @Override
    public void setMaxHP() {
        this.maxHP = 35 + getLevel()*8;
    }

    @Override
    public void setBaseDamage(){
        this.baseDamage = 12 + getLevel()*3;
    }

    @Override
    public void setCrit() {
        this.crit = 10 + getLevel()*2;
        if(getCrit() > 100){
            this.crit = 100;
        }
    }
}
