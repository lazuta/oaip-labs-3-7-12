package Lab6;

public class Plant {
    protected int maxPeople;
    protected double size;
    protected double power;
    protected String street;
    protected int countShip;

    public Plant() {}

    public Plant(int maxPeople, double size, double power, String street, int countShip) {
        this.maxPeople = maxPeople;
        this.size = size;
        this.power = power;
        this.street = street;
        this.countShip = countShip;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getCountShip() {
        return countShip;
    }

    public void setCountShip(int countShip) {
        this.countShip = countShip;
    }

    protected void math2() {
        int x = 2 + 2;
    }

    protected void income() {
        System.out.println((power / maxPeople) > 1 ? ("Завод (" + street + ") функционирует прекрасно.") : ("Завод (" + street + ") несет финансовые поетри"));
    }

    protected String done() {
        return "Единица продукции произведена";
    }

    protected double timeDone() {
        return size / power;
    }

    @Override
    public String toString() {
        return "Plant{" +
                "maxPeople=" + maxPeople +
                ", size=" + size +
                ", power=" + power +
                ", street='" + street + '\'' +
                '}';
    }
}
