import java.util.Scanner;

public class Moar extends Person{  
    public static void main(String[] args) {
        Person person = new Person();
        
        System.out.println("What class would you like to play?");
        System.out.println("1. Assassin");
        System.out.println("2. Warrior");
        System.out.println("3. Mage");
        System.out.println("4. Elemental");
        int choice = person.scnr.nextInt();
        
        switch (choice) {
            case 1:
                person.setStatsAssassin();
                person.setClassName("Assassin");
                break;
            case 2:
                person.setStatsWarrior();
                person.setClassName("Warrior");
                break;
            case 3:
                person.setStatsMage();
                person.setClassName("Mage");
                break;
            case 4:
                person.setStatsElemental();
                person.setClassName("Elemental");
                break;
            default:
                break;
        }
        
        displayHeroStats(person);
        
        System.out.print("Would you like to fight an enemy? ");
        Scanner scnr = new Scanner(System.in);
        String fightEnemy = scnr.next();
        
        if (fightEnemy.equals("y") || fightEnemy.equals("yes") || fightEnemy.equals("Y") || fightEnemy.equals("Yes")) {
            Person enemy = new Person();
            boolean battle = true;
            enemy.setStatsEnemy();
            displayHeroStats(enemy);
            scnr = new Scanner(System.in);
            while (battle) {
                if (person.getHealth() <= 0) {
                    battle = false;
                    System.out.println("You have died.");
                    break;
                }
                if (enemy.getHealth() <= 0) {
                    battle = false;
                    System.out.println("You have kill the enemy");
                    break;
                }
                
                displayPlayerMenu();
                System.out.print("Enter your choice: ");
                int c = scnr.nextInt();
                switch (c) {
                    case 1:
                        enemy.takeDamage(person.getAttack());
                        //System.out.println("Enemy health: " + enemy.getHealth());
                        System.out.println(enemy.getPlayerName() + " took " + person.getAttack() + " damage and now has " + enemy.getHealth() + " health.");
                        break;
                    case 2:
                        person.increaseArmor();
                        break;
                    case 3:
                        //end battle
                        break;
                    default:
                        
                        break;
                }
                if (person.getHealth() <= 0) {
                    battle = false;
                    System.out.println("You have died.");
                    break;
                }
                if (enemy.getHealth() <= 0) {
                    battle = false;
                    System.out.println("You have kill the enemy");
                    break;
                }
                
                System.out.println("Enemy attacks");
                person.takeDamage(enemy.getAttack());
                System.out.println(person.getPlayerName() + " took " + enemy.getAttack() + " damage and now has " + person.getHealth() + " health.");
                
            }
            //out of battle
            
        } else {
            System.out.println("Goodbye!");
        }
    }   
    
    public static void displayHeroStats(Person p) {
        System.out.println(p.getPlayerName() + ", Class " + p.getClassName() + ". " + p.getHealth() + " health. " + p.getArmor() + "% armor.");
    }
    
    public static void displayPlayerMenu() {
        System.out.println("Player Menu");
        System.out.println("1. Attack");
        System.out.println("2. Defend");
        System.out.println("3. Run");
    }

    public static void enemyAttack() {
        
    }
}

