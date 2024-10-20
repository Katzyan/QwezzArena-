package org.example.characters;

import org.example.items.ArmorType;
import org.example.items.Items;
import org.example.items.SlotType;

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

    @Override
    public void equipItem(Items item){
        if(item.getArmorType() == ArmorType.CLOTH || item.getArmorType() == ArmorType.WEAPON || item.getArmorType() == ArmorType.RING || item.getArmorType() == ArmorType.CLOAK){
            switch (item.getSlotType()){
                case SlotType.HEAD:
                    setEquipped(0, item);
                    break;
                case SlotType.CHEST:
                    setEquipped(1, item);
                    break;
                case SlotType.LEGS:
                    setEquipped(2, item);
                    break;
                case SlotType.CLOAK:
                    setEquipped(3, item);
                    break;
                case SlotType.RING:
                    setEquipped(4, item);
                    break;
                case SlotType.MAINHAND:
                    setEquipped(5, item);
                    break;
                case SlotType.OFFHAND:
                    setEquipped(6, item);
                    break;
                default:
                    System.out.println("Unable to equip item");
            }
        }else {
            System.out.println("Worlocks should wear cloth");
        }
    }
}
