package org.example.characters;

import org.example.items.Items;

public abstract class MainCharacter {
    private String name;
    private String classType;
    private int level;

    private int maxHP;
    private int currentHP;
    private int crit;
    private int regen;

    private Items[] inventory = new Items[5];
    private Items[] equipped = new Items [5];



public MainCharacter(String name, String classType, int maxHP, int crit, int regen){
    setName(name);
    setClassType(classType);
    setLevel(1);
    setMaxHP(maxHP);
    setCurrentHP();
    setCrit(crit);
    setRegen(regen);
}

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
            System.out.println("Head Slot: " + equipped[0].getName());
            System.out.println(equipped[0].getDescription());
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
            System.out.println("Cloak Slot: " + equipped[3].getName());
            System.out.println(equipped[3].getDescription());
        } else {
            System.out.println("Cloak Slot: Empty");
        }

        if(equipped[4] != null){
            System.out.println("Ring Slot: " + equipped[4].getName());
            System.out.println(equipped[4].getDescription());
        } else {
            System.out.println("Ring Slot: Empty");
        }

    }

    public void charInfo(){
        System.out.println();
        System.out.println("Name: " + getName());
        System.out.println("Level: " + getLevel()  + " " + getClassType());
        System.out.println("HP: " + getCurrentHP() + "/" + getMaxHP());
        System.out.println("Crit chance: " + getCrit() + "%");
        System.out.println("-------------------");
        displayEquipped();
        System.out.println("-------------------");
        displayInventory();
    }

}
