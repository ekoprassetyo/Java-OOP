package ThisAndSuper;

class PersonSuper {
    String name = "Eko";
    int age = 23;
}

public class Super extends PersonSuper{
    String name = "Super";
    int age = 20;
    float salary = 40000f;

    public void showInfo() {
        System.out.println("My name is " + super.name);
        System.out.println("I am " + super.age + " years old");
        System.out.println("Salary " + salary);
    }
}
