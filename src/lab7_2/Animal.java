package lab7_2;

import java.security.SecureRandom;

public class Animal {
    private int speed;

    public Animal() {
    }

    public Animal(int maxSpeed) {
        this.speed = new SecureRandom().nextInt(maxSpeed);
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }


}
