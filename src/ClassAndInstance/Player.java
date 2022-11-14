package ClassAndInstance;

public class Player {
    String name;
    int speed;
    int healthPotion;

    void run(){
        System.out.println(name + " is running");
        System.out.println("Speed : " + speed);
    }

    boolean isDead () {
        if (healthPotion <= 0) {
            return true;
        }
        return false;
    }
}
