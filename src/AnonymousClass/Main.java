package AnonymousClass;

public class Main {

    // membuat variable di dalam class
    static String ucapan = "Ini Tutorial Anonymous Class";

    public static void main(String[] args) {

        // membuat variable yang ada di dalam method main
        String name = "Eko";

        Button btn = new Button();

        // membuat class anonymous untuk implementasi interface
        btn.setClickAction(new Clickable() {
            // membuat variable yang ada di dalam class anonymous
            String pesan = "Belajar Anonymous class di Java";
            @Override
            public void onClick() {
                System.out.println("Tombol sudah diklik!");
                System.out.println("Berhasil!");
                // Mengakses variable
                System.out.println(ucapan);
                System.out.println(name);
                System.out.println(pesan);
            }
        });

        // mencoba klik tombol
        btn.onClick();

    }
}
