import java.util.Scanner;
import java.util.Random;

public class Person{
    public Scanner scnr = new Scanner(System.in);
    private int health = 0;
    private double armor = 0.0;
    private int attack = 0;
    private String name = "";
    private String className = "";
    
    public int getHealth() {
        return health;
    }
    
    public double getArmor() {
        return armor;
    }
    
    public int getAttack() {
        return attack;
    }
    
    public void increaseArmor() {
        armor += 0.05;
        System.out.println("Armor increased to " + getArmor());
    }
    
    public void takeDamage(double dmg) {
        health = (int) (health - (dmg - (dmg*armor)));
    }
    
    public String getPlayerName() {
        return name;
    }
    
    public String getName() {
        System.out.print("What is your name? ");
        String s = scnr.next();
        return s;
    }
    
    public void setStatsAssassin() {
        health = 200;
        armor = 0.15;
        attack = 30;
        name = getName();
    }
    
    public void setStatsWarrior() {
        health = 500;
        armor = 0.25;
        attack = 20;
        name = getName();
    }
    
    public void setStatsMage() {
        health = 250;
        armor = 0.10;
        attack = 25;
        name = getName();
    }
    
    public void setStatsElemental() {
        health = 300;
        armor = 0.10;
        attack = 25;
        name = getName();
    }
    
    public void setStatsEnemy() {
        Random randHealth = new Random();
        Random randArmor = new Random();
        health = randHealth.nextInt(300);
        armor = 0.15;
        attack = 25;
        name = "Krokil";
        className = "Goblin";
    }
    
    public void setClassName(String s) {
        className = s;
    }
    
    public String getClassName() {
        return className;
    }
}