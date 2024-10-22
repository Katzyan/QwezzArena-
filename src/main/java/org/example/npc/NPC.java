package org.example.npc;

public class NPC {
    private String name;
    private int hp;
    private int damage;
    private int critChance;

    public NPC(String name, int hp, int damage, int critChance){
        setName(name);
        setHp(hp);
        setDamage(damage);
        setCritChance(critChance);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getCritChance() {
        return critChance;
    }

    public void setCritChance(int critChance) {
        this.critChance = critChance;
    }


    public void takeDamage(int damage){
        this.hp -= damage;
    }
}
