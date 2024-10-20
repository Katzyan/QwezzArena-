package org.example.characters;

import org.example.items.ArmorType;
import org.example.items.Items;
import org.example.items.SlotType;

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
        Items noviceCape = new Items("Novice Cape", 3,"Novice cape is doesn`t do anythig.", 0, 0, 0, 20, ArmorType.CLOAK, SlotType.CLOAK);
        equipItem(noviceCape);

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
        if (getCrit() > 100) {
            this.crit = 100;
        }
    }

    @Override
    public void equipItem(Items item){
        if(item.getArmorType() == ArmorType.PLATE || item.getArmorType() == ArmorType.WEAPON || item.getArmorType() == ArmorType.RING || item.getArmorType() == ArmorType.CLOAK){
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
            System.out.println("Warriors should wear plate");
        }
    }


}
