package org.example.characters;

import org.example.items.Items;
import org.example.items.SlotType;

public abstract class MainCharacter {
    private String name;
    private String classType;
    private int level;
    private String armorTypeAccepted;
    private int gold;

    protected int baseDamage;
    protected int maxHP;
    private int currentHP;
    protected int crit;
    protected int regen;

    private Items[] inventory = new Items[7];
    private Items[] equipped = new Items [7];



public MainCharacter(String name, String classType, int maxHP, int baseDamage, int crit, int regen, String armorTypeAccepted, int gold){
    setName(name);
    setClassType(classType);
    setLevel(1);
    setMaxHP(maxHP);
    setCurrentHP();
    setCrit(crit);
    setRegen(regen);
    setBaseDamage(baseDamage);
    setArmorTypeAccepted(armorTypeAccepted);
    setGold(gold);
}


    //Setters amd Getters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name != null && !name.equals("")){
            this.name = name;
        }
    }

    public String getClassType() {
        return classType;
    }

    public void setClassType(String classType) {
        this.classType = classType;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getMaxHP() {
        return maxHP;
    }

    public void setMaxHP(int maxHP) {
        this.maxHP = maxHP;
    }
    public abstract void setMaxHP();

    public int getCurrentHP() {
        return currentHP;
    }

    public void setCurrentHP() {
        this.currentHP = this.maxHP;
    }

    public int getCrit() {
        return crit;
    }

    public void setCrit(int crit) {
        this.crit = crit;
    }
    public abstract void setCrit();

    public int getRegen() {
        return regen;
    }

    public void setRegen(int regen) {
        this.regen = regen;
    }

    public Items[] getInventory() {
        return inventory;
    }

    public Items[] getEquipped() {
        return equipped;
    }

    public void setEquipped(int i, Items item){
        if((i >= 0 && i < 7) && item != null) {
            this.equipped[i] = item;
        }
    }

    public int getBaseDamage() {
        return baseDamage;
    }

    public void setBaseDamage(int baseDamage) {
        this.baseDamage = baseDamage;
    }
    public abstract void setBaseDamage();

    public String getArmorTypeAccepted() {
        return armorTypeAccepted;
    }

    public void setArmorTypeAccepted(String armorTypeAccepted) {
        this.armorTypeAccepted = armorTypeAccepted;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    //Display
    public void displayInventory(){
        System.out.println("Inventory: ");
        for(int i = 0; i < inventory.length; i++){
            if(inventory[i] != null ){
                System.out.println("Slot " + (i+1) + ": " + inventory[i].getName());
            } else {
                System.out.println("Slot " + (i+1) + ": Empty");
            }
        }
    }

    public void displayEquipped(){
        System.out.println("Equipped items:");
        if(equipped[0] != null){
            System.out.println("Head Slot: " + equipped[0].getName() + " - " + equipped[0].getDescription() );

        } else {
            System.out.println("Head Slot: Empty");
        }

        if(equipped[1] != null){
            System.out.println("Chest Slot: " + equipped[1].getName());
            System.out.println(equipped[1].getDescription());
        } else {
            System.out.println("Chest Slot: Empty");
        }

        if(equipped[2] != null){
            System.out.println("Legs Slot: " + equipped[2].getName());
            System.out.println(equipped[2].getDescription());
        } else {
            System.out.println("Legs Slot: Empty");
        }

        if(equipped[3] != null){
            System.out.println("Cloak Slot: " + equipped[3].getName() + " - " + equipped[3].getDescription());

        } else {
            System.out.println("Cloak Slot: Empty");
        }

        if(equipped[4] != null){
            System.out.println("Ring Slot: " + equipped[4].getName());
            System.out.println(equipped[4].getDescription());
        } else {
            System.out.println("Ring Slot: Empty");
        }

        if(equipped[5] != null){
            System.out.println("Main Hand Slot: " + equipped[5].getName());
            System.out.println(equipped[4].getDescription());
        } else {
            System.out.println("Main Hand Slot: Empty");
        }

        if(equipped[6] != null){
            System.out.println("Off Hand Slot: " + equipped[5].getName());
            System.out.println(equipped[4].getDescription());
        } else {
            System.out.println("Off Hand Slot: Empty");
        }

    }

    public void charInfo(){
        System.out.println();
        System.out.println("Name: " + getName());
        System.out.println("Level: " + getLevel()  + " " + getClassType());
        System.out.println("HP: " + getCurrentHP() + "/" + getMaxHP());
        System.out.println("Base Damage: " + getBaseDamage());
        System.out.println("Crit chance: " + getCrit() + "%");
        System.out.println("-------------------");
        displayEquipped();
        System.out.println("-------------------");
        displayInventory();
    }


    //Functionality

    public void levelUp(int levels){
    this.level = this.level + levels;
        System.out.println("D I N G ! " + getName() + " has leveld up!!!!");
    refreshChar();

    }

    public void refreshChar(){
    setMaxHP();
    setCurrentHP();
    setCrit();
    setBaseDamage();
    }

    public abstract void equipItem(Items item);



}
