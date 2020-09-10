package hw5;

public abstract class Role {
    private String name;

    public abstract int attack();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Magicer extends Role {
    private int magicLevel;

    public Magicer(int magicLevel, String name) {
        super.setName(name);
        this.setMagicLevel(magicLevel);
    }

    @Override
    public int attack() {
        return (this.magicLevel) * 5;
    }

    public int getMagicLevel() {
        return this.magicLevel;
    }

    public void setMagicLevel(int magicLevel) {
        this.magicLevel = magicLevel;
    }
}

class Soldier extends Role {
    private int damage;

    public Soldier(int damage, String name) {
        super.setName(name);
        this.setDamage(damage);
    }

    @Override
    public int attack() {
        return this.damage;
    }

    public int getDamage() {
        return this.damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}