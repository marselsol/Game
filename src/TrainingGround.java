public class TrainingGround {
    public static void main(String[] args) {
        Mage mage = new Mage("Маг", 17);
        Warrior warrior = new Warrior("Воин", 15);
        Archer archer = new Archer("Лучник", 10);
        Enemy zombie = new Enemy(100, "Зомби");
        attackEnemy(zombie, mage, warrior, archer);

    }

    public static void attackEnemy(Enemy enemy, Hero... heroes) {
        while(enemy.isAlive()) {
            for (Hero i : heroes) {            
            if(enemy.isAlive()) {
                i.attackEnemy(enemy);
                enemy.takeDamage(i.getDamage());
            } else {
                break;
                    }            
                }    
            }         
        }
    }
