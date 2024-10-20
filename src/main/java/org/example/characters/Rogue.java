package org.example.characters;

import org.example.items.ArmorType;
import org.example.items.Items;
import org.example.items.SlotType;

public class Rogue extends MainCharacter{

    /**
     * Rogues have low HP but high damage output, focusing on quick attacks with higher crit chances
     *
     * Base HP 30 -> +5 per level
     * Base Damage 15 -> +3 per level
     * Base Crit 35% -> +3% per level
     *
     */
    public Rogue(String name, String classType, int maxHP, int baseDamage, int crit, int regen, String armorTypeAccepted, int gold){
        super(name, classType, maxHP, baseDamage, crit, regen, armorTypeAccepted, gold);

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

    @Override
    public void equipItem(Items item){
        if(item.getArmorType() == ArmorType.LEATHER || item.getArmorType() == ArmorType.WEAPON || item.getArmorType() == ArmorType.RING || item.getArmorType() == ArmorType.CLOAK){
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
            System.out.println("Rogues should wear leather");
        }
    }
}
