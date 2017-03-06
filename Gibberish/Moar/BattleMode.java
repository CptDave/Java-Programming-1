import java.util.Scanner;

public class BattleMode {
    public void enterBattle(Person p1, Person p2) {
        System.out.println("Entering battle mode!");
        
    }
    
    public void displayPlayerMenu() {
        System.out.println("Player Menu");
        System.out.println("1. Attack");
        System.out.println("2. Defend");
        System.out.println("3. Run");
        Scanner scnr = new Scanner(System.in);
        String s = scnr.next();
        
        switch (s) {
            case 1:
                p2.takeDamage(p1.getAttack());
                break;
            default:
                break;
        }
    }

    public void chooseEnemyAttack() {
        
    }
}