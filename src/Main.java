public class Main {
    public static void main(String[] args) {

//        Membuat objek bangun datar
        BangunDatar bangunDatar = new BangunDatar();

//        Membuat objek persegi dan mengisi properti
        Persegi persegi = new Persegi();
        persegi.sisi = 20;

//        Membuat objek lingkaran dan mengisi properti
        Lingkaran lingkaran = new Lingkaran();
        lingkaran.r = 24;

//        Membuat objek persegi panjang dan mengisi properti
        PersegiPanjang persegiPanjang = new PersegiPanjang();
        persegiPanjang.panjang = 10;
        persegiPanjang.lebar = 5;

//        Membuat objek segitiga dan mengisi properti
        Segitiga segitiga = new Segitiga();
        segitiga.alas = 15;
        segitiga.tinggi = 10;


//        Memanggil method luas dan keliling
        bangunDatar.luas();
        bangunDatar.keliling();

        persegi.luas();
        persegi.keliling();

        lingkaran.luas();
        lingkaran.keliling();

        persegiPanjang.luas();
        persegiPanjang.keliling();

        segitiga.luas();
    }
}