/*
    TestTank.java
    CIS 160
    David Wartenbe
    Programming Project 6
    11/25/2016
    
    This program deminstrates creating a class and using accessors and modifiers.
*/

public class TestTank {
    public static void main(String[] args) {
        Tank tank1 = new Tank();
        Tank tank2 = new Tank(17, 100, -30);
        
        displayTank(tank1);
        displayTank(tank2);
        tank1.increaseSpeed();
        tank1.reload();
        tank2.decreaseSpeed();
        tank2.decreaseSpeed();
        tank2.fire();
        tank2.reload();
        tank2.reload();
        tank2.fire();
        displayTank(tank1);
        displayTank(tank2);
    }
    
    public static void displayTank(Tank tank) {
        System.out.printf("Tank: %2d, Ammo: %2d, Speed: %4.1f%n",
            tank.getId(), tank.getAmmo(), tank.getSpeed());
    }
}
