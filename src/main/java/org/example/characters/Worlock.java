package org.example.characters;

import org.example.items.ArmorType;
import org.example.items.Items;
import org.example.items.SlotType;
import org.example.npc.NPC;

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
        if(getLevel() < 1){
            this.maxHP = 35 + getLevel()*8;
        } else {
            this.maxHP = 35;
        }

    }

    @Override
    public void setBaseDamage(){
        if(getLevel() < 1){
            this.baseDamage = 12 + getLevel()*3;
        }else {
            this.baseDamage = 12;
        }

    }

    @Override
    public void setCrit() {
        if(getLevel() < 1){
            this.crit = 10 + getLevel()*2;
         }else {
            this.crit = 10 + getLevel()*2;
        }


        if(getCrit() > 100){
            this.crit = 100;
        }
    }

    @Override
    public void equipItem(Items item){
        if(item.getArmorType() == ArmorType.CLOTH || item.getArmorType() == ArmorType.WEAPON || item.getArmorType() == ArmorType.RING || item.getArmorType() == ArmorType.CLOAK){
            switch (item.getSlotType()){
                case SlotType.HEAD:
                    if(isEquippedSlotEmpty(0)){
                        setEquipped(0, item);
                        break;
                    }
                    break;
                case SlotType.CHEST:
                    if(isEquippedSlotEmpty(1)){
                        setEquipped(1, item);
                        break;
                    }
                    break;
                case SlotType.LEGS:
                    if(isEquippedSlotEmpty(2)){
                        setEquipped(2, item);
                        break;
                    }
                    break;
                case SlotType.CLOAK:
                    if(isEquippedSlotEmpty(3)){
                        setEquipped(3, item);
                        break;
                    }
                    break;
                case SlotType.RING:
                    if(isEquippedSlotEmpty(4)){
                        setEquipped(4, item);
                        break;
                    }
                    break;
                case SlotType.MAINHAND:
                    if(isEquippedSlotEmpty(5)){
                        setEquipped(5, item);
                        break;
                    };
                    break;
                case SlotType.OFFHAND:
                    if(isEquippedSlotEmpty(6)){
                        setEquipped(6, item);
                        break;
                    }
                    break;
                default:
                    System.out.println("Unable to equip item");
            }
        }else {
            System.out.println("Worlocks should wear cloth");
        }
    }

    @Override
    public void showAbilities() {

    }

    @Override
    public void lightAttack(NPC enemy) {

    }

    @Override
    public void heavyAttack(NPC enemy) {

    }

    @Override
    public void sustainAttack(NPC enemy) {

    }

    @Override
    public void crowdControl(NPC enemy) {

    }

    @Override
    public void damageOverTime(NPC enemy) {

    }

    @Override
    public boolean isCrit(int critChance) {
        return false;
    }

    @Override
    public void takeDamage() {

    }
}
