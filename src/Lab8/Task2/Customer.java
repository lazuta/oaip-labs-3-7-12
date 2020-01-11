package Lab8.Task2;

public class Customer extends Rate{
    protected String name;
    protected int age;

    public Customer(double price, String title, String name, int age) {
        super(price, title);
        this.name = name;
        this.age = age;
    }

    public Customer(String name, String adress, double price, String title, String name1, int age) {
        super(name, adress, price, title);
        this.name = name1;
        this.age = age;
    }
}
