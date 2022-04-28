public abstract class Hero {

    private String name;
    private int damage;

    public abstract void attackEnemy(Enemy enemy);

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public Hero(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }
}