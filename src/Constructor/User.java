package Constructor;

/*
    * Constructor adalah method yang akan dieksekusi pada saat pembuatan objek
    * Seperti contoh dibawah kita membuat costructor user yang berisikan 2 paramater Username dan Password
    * Jadi pada saat pembuatan objek di DemoConstructor maka harus menambahkan nilai pada 2 parameter tersebut
 */

public class User {
    public String username;
    public String password;

        public User (String username, String password){
            this.username = username;
            this.password = password;

        }
}
