package AnonymousFunction;

/*
    * Anonymous function memiliki syntax () -> {} Jika hanya memiliki 1 eksprisi tidak menggunakan '{}' tidak apa
    * () sebagai tempat kita menaruh parameter
    * -> (operator lambda) simbol yang menandakan fungsi ini adalah lambda/anonymous function
    * {} body dari fungsinya
 */

public class Main {
    public static void main(String[] args) {

        String hello = "Hello World !";

        Button btn = new Button();

        // membuat class anonymous untuk implementasi interface
        btn.setClickAction(() -> {
            System.out.println("Tombol telah di klik!");
            System.out.println("Berhasil!");
            System.out.println(hello);
        });

        btn.doClick();
    }
}
