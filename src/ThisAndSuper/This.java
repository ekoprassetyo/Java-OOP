package ThisAndSuper;

class PersonThis {
    String name = "Ekoy";
    int age = 22;
}

public class This extends PersonThis{
    String name = "Paijo";
    int age = 20;
    float salary = 2000000f;

    public void showInfoThis() {
        System.out.println("My Manajer Name is " + super.name);
        System.out.println("And my name is " + this.name);
        System.out.println("I am " + this.age + " years old");
        System.out.println("Salary " + salary);
    }
}
