package Polimorfisme;

public class Segitiga extends BangunDatar {

    float alas;
    float tinggi;

    @Override
    float luas() {
        float luas = 1.5f * (alas * tinggi);
        System.out.println("Luas Polimorfisme.Segitiga: " + luas);
        return luas;
    }

}
