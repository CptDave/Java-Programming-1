/*
    Tank.java
    CIS 160
    David Wartenbe
    Programming Project 6
    11/25/2016
    
    This program defines the Tank class
*/

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