package PolimorfismeNotification;

/*
    * Intinya Polimorfisme bentuk methodnya beda-beda, tapi namanya sama
    * Contoh pada program ini methodnya sama yaitu sendMessage, namun implementasinya berbeda-beda
    * Ketika kita membuat method dengan nama sama tapi isi parameter berbeda itu juga dinamakan Polimorfisme
    * Catatan nantinya pada dunia nyata : EmailNotification biasanya akan mengirim email dengan metode SMTP atau API
    * Sedangkan SMS bisa melalui SMS Gateway.
    * PushNotification, nanti akan menggunakan API yang berbeda.
 */

public class Main {
    public static void main(String[] args) {
        String emailPenerima = "ekoyganteng@mail.com";
        String noHp = "08789101112";
        String mobileId = "iOS-56548";

        String content = "Ini isi dari Konten";

        EmailNotification emailNotif = new EmailNotification();
        SMSNotification smsNotif = new SMSNotification();
        PushNotification pushNotif = new PushNotification();

        emailNotif.sendMessage(emailPenerima, content);
        smsNotif.sendMessage(noHp, content);
        pushNotif.sendMessage(mobileId, content);
    }
}
