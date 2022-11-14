package Interface;

public class Xiaomi implements Phone{
    private int volume;
    private boolean isPowerOn;

    public Xiaomi() {
        // set volume awal
        this.volume = 50;
    }

    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("Handphone nyala");
        System.out.println("Welcome to Xiaomi");
        System.out.println("Android Version 33");
    }

    @Override
    public void powerOff() {
        isPowerOn = false;
        System.out.println("Handphone di matikan");

    }

    @Override
    public void volumeUp() {
        if (isPowerOn){
            if (volume == MAX_VOLUME ) {
                System.out.println("Volume Full !");
                System.out.println("Volume sudah : " + this.getVolume() + "%" );
            } else {
                this.volume += 10;
                System.out.println("Volume sekarang : " + this.getVolume() + "%" );
            }
        } else {
            System.out.println("HP Belum dinyalakan nih...");
        }
    }

    @Override
    public void volumeDown() {
        if (isPowerOn){
            if (volume == MIN_VOLUME ) {
                System.out.println("Volume = 0 %");
            } else {
                this.volume -= 10;
                System.out.println("Volume sekarang : " + this.getVolume() + "%" );
            }
        } else {
            System.out.println("HP Belum dinyalakan nih...");
        }
    }

    public int getVolume() {
        return this.volume;
    }
}
