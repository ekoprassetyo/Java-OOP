package Polimorfisme;

public class PersegiPanjang extends BangunDatar {

    float panjang;
    float lebar;

    @Override
    float luas(){
        float luas = panjang * lebar;
        System.out.println("Luas Polimorfisme.Persegi Panjang : " + luas);
        return luas;
    }

    @Override
    float keliling(){
        float keliling = 2 * panjang * lebar;
        System.out.println("Keliling Polimorfisme.Persegi Panjang : " + keliling);
        return keliling;
    }
}
