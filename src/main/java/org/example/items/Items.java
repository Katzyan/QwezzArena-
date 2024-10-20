package org.example.items;

public class Items {
    private String name;
    private String description;
    private int hpModifier;
    private int critModifier;

    // 0 for Head, 1 for Chest, 2 for Legs, 3 for Cloak, 4 for Ring
    private int slotSpace;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCritModifier() {
        return critModifier;
    }

    public void setCritModifier(int critModifier) {
        this.critModifier = critModifier;
    }

    public int getSlotSpace() {
        return slotSpace;
    }

    public void setSlotSpace(int slotSpace) {
        this.slotSpace = slotSpace;
    }

    public int getHpModifier() {
        return hpModifier;
    }

    public void setHpModifier(int hpModifier) {
        this.hpModifier = hpModifier;
    }
}
