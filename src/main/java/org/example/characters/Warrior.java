package org.example.characters;

import org.example.items.ArmorType;
import org.example.items.Items;
import org.example.items.SlotType;
import org.example.npc.NPC;

import java.util.Random;

public class Warrior extends MainCharacter {

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

       Items noveiceChestpiece = new Items("Novice Chestpiece", "Novice chestpiece don`t do nothing", 0, 0, 0, 20, ArmorType.PLATE, SlotType.CHEST);
       Items noviceCape = new Items("Novice Cape","Novice cape is doesn`t do anythig.", 0, 0, 0, 20, ArmorType.CLOAK, SlotType.CLOAK);
       Items noviceLeggings = new Items("Novice Leggings", "Novice leggings don`t do shit", 0, 0, 0, 20, ArmorType.PLATE, SlotType.LEGS);
       Items woodenSword = new Items("Wooden Sword", "You can bonk people", 0, 0, 0, 30, ArmorType.WEAPON, SlotType.MAINHAND);


        equipItem(noviceCape);
        equipItem(noveiceChestpiece);
        equipItem(noviceLeggings);
        equipItem(woodenSword);


    }

    @Override
    public void setMaxHP() {
        if(getLevel() != 1){
            this.maxHP = 50 + getLevel()*10;
        } else {
            this.maxHP = 50;
        }
    }

    @Override
    public void setBaseDamage(){
        if(getLevel() != 1) {
            this.baseDamage = 10 + getLevel() * 2;
        } else {
            this.baseDamage = 10;
        }
    }

    @Override
    public void setCrit() {
        if(getLevel() != 1){
            this.crit = 5 + getLevel();
        } else {
            this.crit = 5;
        }

        if (getCrit() > 100) {
            this.crit = 100;
        }
    }

    @Override
    public void equipItem(Items item){
        if(item.getArmorType() == ArmorType.PLATE || item.getArmorType() == ArmorType.WEAPON || item.getArmorType() == ArmorType.RING || item.getArmorType() == ArmorType.CLOAK){
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
                    }
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
            System.out.println("Warriors should wear plate");
        }
        refreshChar();
    }



    // Abilities

    @Override
    public boolean isCrit(int critChance){
        if(critChance == 0){
            return false;
        }
        if(critChance >= 100){
           return true;
       }
        Random random = new Random();
        int rolledValue = random.nextInt(100) + 1;
        if(rolledValue <= critChance){
            return true;
        }
        return false;
    }

    @Override
    public void lightAttack(NPC enemy){
        System.out.println("You perform a light attack on " + enemy.getName());
        if(isCrit(super.getCrit())){
            System.out.println("Critical HIT. You deal " + super.baseDamage * 2 + " damage" );
            enemy.takeDamage(super.baseDamage * 2);
        }else {
            System.out.println("You deal " + super.baseDamage + " damage");
            enemy.takeDamage(super.baseDamage);
        }
    }

    @Override
    public void heavyAttack(NPC enemy){
        System.out.println("You perform a heavy attack on " + enemy.getName());
        if(isCrit(super.getCrit())){
            System.out.println("Critical HIT. You deal " + (super.baseDamage + super.baseDamage/2) * 2 + " damage" );
            enemy.takeDamage((super.baseDamage + super.baseDamage/2) * 2);
        }else {
            System.out.println("You deal " + (super.baseDamage + super.baseDamage/2) + " damage");
            enemy.takeDamage(super.baseDamage + super.baseDamage/2);
        }
    }

    @Override
    public void sustainAttack(NPC enemy){

    }

    @Override
    public void crowdControl(NPC enemy){

    }

    @Override
    public void damageOverTime(NPC enemy){

    }

    @Override
    public void showAbilities() {
        if(this.getLevel() == 1){
            System.out.println("1. Auto Attack - Swing at the target. No Cooldown");
            System.out.println("2. Heroic Strike - Channel your inner rage for a big swing at the target. Cooldown 1 round");

        }else if(this.getLevel() < 3){ // adica level 2
            System.out.println("1. Auto Attack - Swing at the target. No Cooldown");
            System.out.println("2. Heroic Strike - Channel your inner rage for a big swing at the target. Cooldown 1 round");
            System.out.println("3. Rend - Slashes the target and makes them bleed over 2 rounds");
        }else if(this.getLevel() < 4){ // adica level 3
            System.out.println("1. Auto Attack - Swing at the target. No Cooldown");
            System.out.println("2. Heroic Strike - Channel your inner rage for a big swing at the target. Cooldown 1 round");
            System.out.println("3. Rend - Slashes the target and makes them bleed over 2 rounds");
            System.out.println("4. Overpower - Swing at the target, dealing damage and healing for some amount");
        }else if(this.getLevel() >= 5 ){ // adica levle 5 sau peste
            System.out.println("1. Auto Attack - Swing at the target. No Cooldown");
            System.out.println("2. Heroic Strike - Channel your inner rage for a big swing at the target. Cooldown 1 round");
            System.out.println("3. Rend - Slashes the target and makes them bleed over 2 rounds");
            System.out.println("4. Overpower - Swing at the target, dealing damage and healing for some amount");
            System.out.println("5. ThunderBolt - Stuns the target for 1 round");
        }


    }

    @Override
    public void takeDamage() {

    }






}
