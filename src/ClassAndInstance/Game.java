package ClassAndInstance;

/*
    * Pada class Player kita mendefinisikan attribut name bertipe data String, speed & healthPotion bertipe integer
    * Dan pada class Player memiliki sebuah function/method run dan isDead
    * Lalu pada class Game kita membuat objek baru (instance) dengan nama player
    * Dan mengisi value dari attribut class Player untuk menjalankan method run dan isDead
 */

public class Game {
    public static void main(String[] args) {
        Player player = new Player();

        player.name = "Eko";
        player.speed = 80;
        player.healthPotion = 10;

        player.run();

        if (player.isDead()) {
            System.out.println("Game Over");
        } else {
            System.out.println("Your HP : " + player.healthPotion);
        }
    }
}
