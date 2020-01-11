package Lab8.Task2;

public class Rate extends Communication{
    protected double price;
    protected String title;

    public Rate(double price, String title) {
        this.price = price;
        this.title = title;
    }

    public Rate(String name, String adress, double price, String title) {
        super(name, adress);
        this.price = price;
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
