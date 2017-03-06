/*
    ProgrammingProject6.java
    CIS 160
    David Wartenbe
    11/25/2016
    Programming Project 6
    
    This program deminstrates creating a class and using accessors and modifiers.
*/

public class ProgrammingProject6 {
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

class Tank {
    //fields
    private int id, ammo;
    private float speed;
    
    //contructors
    public Tank() {
        setId(0);
        setSpeed(0.0f);
        setAmmo(0);
    }
    
    public Tank(int id, float speed, int ammo) {
        setId(id);
        setSpeed(speed);
        setAmmo(ammo);
    }
    
    //modifiers
    public void setId(int id) {
        if (id < 0) this.id = 0;
        else if (id > 50) this.id = 50;
        else this.id = id;
    }
    
    public void setSpeed(float speed) {
        if (speed < 0) this.speed = 0;
        else if (speed > 60) this.speed = 60;
        else this.speed = speed;
    }
    
    public void setAmmo(int ammo) {
        if (ammo < 0) this.ammo = 0;
        else if (ammo > 40) this.ammo = 40;
        else this.ammo = ammo;
    }
    
    //accessors
    public int getId() {
        return id;
    }
    
    public float getSpeed() {
        return speed;
    }
    
    public int getAmmo() {
        return ammo;
    }
    
    //methods
    public void increaseSpeed() {
        setSpeed(getSpeed() + 5);
    }
    
    public void decreaseSpeed() {
        setSpeed(getSpeed() - 5);
    }
    
    public void fire() {
        setAmmo(getAmmo() - 1);
    }
    
    public void reload() {
        setAmmo(getAmmo() + 5);
    }
}