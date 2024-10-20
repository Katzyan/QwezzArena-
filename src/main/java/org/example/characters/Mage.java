package org.example.characters;

public class Mage extends MainCharacter{
    /**
     * Magesdeal high magical damage but have very low HP.
     * They rely on their damage output and crits to eliminate enemies quickly
     *
     * Base HP 20 -> +4 per level
     * Base Damage 18 -> +4 per level
     * Base Crit 35% -> +4% per level
     *
     */
    public Mage(String name, String classType, int maxHP, int baseDamage, int crit, int regen, String armorTypeAccepted, int gold){
        super(name, classType, maxHP, baseDamage, crit, regen, armorTypeAccepted, gold);

    }

    @Override
    public void setMaxHP() {
        this.maxHP = 20 + getLevel()*4;
    }

    @Override
    public void setBaseDamage(){
        this.baseDamage = 18 + getLevel()*4;
    }

    @Override
    public void setCrit() {
        this.crit = 35 + getLevel()*4;
        if(getCrit() > 100){
            this.crit = 100;
        }
    }
}
