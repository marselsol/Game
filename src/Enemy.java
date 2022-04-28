public class Enemy implements Mortal {
    private int health;
    private String name;

    public void takeDamage(int damage) {
        if(isAlive() && damage > health) {
            this.health = 0;
            System.out.println(name + " убит.");
        } else {
            this.health = this.health - Math.min(health, damage);
            System.out.println(name + " получил урон " + damage + ". Осталось " + health + " здоровья.");
        }        
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Enemy(int health, String name) {
        this.health = health;
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }


}
