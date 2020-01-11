package Lab8.Task2;

public class Communication {
    protected String name;
    protected String adress;
    protected int count = 0;

    public Communication() {}

    public Communication(String name, String adress) {
        this.name = name;
        this.adress = adress;

        counter();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    void counter() {
        this.count++;
    }
}
