package SetterAndGetter;

public class DemoGetterAndSetter {
    public static void main(String[] args) {
        User eko = new User();

        eko.setName("Eko");
        eko.setAge(23);

        System.out.println("My name is " + eko.getName());
        System.out.println("I am " + eko.getAge() + " years old");
    }
}
