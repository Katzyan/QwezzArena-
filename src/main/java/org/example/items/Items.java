package org.example.items;

public class Items {
    private String name;
    private String description;
    private int hpModifier;
    private int damageModifier;
    private int critModifier;
    private int buyValue;
    private int sellValue;
    private ArmorType armorType;
    private SlotType slotType;


    // 0 for Head, 1 for Chest, 2 for Legs, 3 for Cloak, 4 for Ring, 5 for Main Hand, 6 for OffHand

    public Items(String name, String description, int hpModifier, int damageModifier, int critModifier, int buyValue, ArmorType armorType, SlotType slotType){
        setName(name);
        setDescription(description);
        setHpModifier(hpModifier);
        setDamageModifier(damageModifier);
        setCritModifier(critModifier);
        setBuyValue(buyValue);
        setSellValue();
        setArmorType(armorType);
        setSlotType(slotType);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name != null && !name.isEmpty()) {
            this.name = name;
        }
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        if(description != null && !description.isEmpty()) {
            this.description = description;
        }
    }

    public int getCritModifier() {
        return critModifier;
    }

    public void setCritModifier(int critModifier) {
        this.critModifier = critModifier;
    }

    public int getHpModifier() {
        return hpModifier;
    }

    public void setHpModifier(int hpModifier) {
        this.hpModifier = hpModifier;
    }

    public int getBuyValue() {
        return buyValue;
    }

    public void setBuyValue(int buyValue) {

        this.buyValue = Math.abs(buyValue);
    }

    public int getSellValue() {
        return sellValue;
    }

    public void setSellValue( ) {
        this.sellValue = getBuyValue() / 2;
    }

    public ArmorType getArmorType() {
        return armorType;
    }

    public void setArmorType(ArmorType armorType) {
            this.armorType = armorType;

    }

    public int getDamageModifier() {
        return damageModifier;
    }

    public void setDamageModifier(int damageModifier) {
        this.damageModifier = damageModifier;
    }

    public SlotType getSlotType() {
        return slotType;
    }

    public void setSlotType(SlotType slotType) {
        this.slotType = slotType;
    }
}
