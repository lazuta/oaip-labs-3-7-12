package Lab9;

public class Shipyard extends Plant {
    public int maxShip;
    public double length;
    public double lengthShip;

    public Shipyard() {}

    public Shipyard(int maxShip, double length, double lengthShip) {
        this.maxShip = maxShip;
        this.length = length;
        this.lengthShip = lengthShip;
    }

    public Shipyard(int maxPeople, double size, double power, String street, int countShip, int maxShip, double length, double lengthShip) {
        super(maxPeople, size, power, street, countShip);
        this.maxShip = maxShip;
        this.length = length;
        this.lengthShip = lengthShip;
    }

    public int getMaxShip() {
        return maxShip;
    }

    public void setMaxShip(int maxShip) {
        this.maxShip = maxShip;
    }


    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLengthShip() {
        return lengthShip;
    }

    public void setLengthShip(double lengthShip) {
        this.lengthShip = lengthShip;
    }

    @Override
    protected void math2() {
        super.math2();
    }

    @Override
    protected void income() {
        super.income();
    }

    @Override
    protected String done() {
        return "Продукция готова. Можно отплывать.";
    }

    @Override
    protected double timeDone() {
        return super.timeDone();
    }

    public int freeCount() {
        return maxShip - super.countShip;
    }

    public double freeLength() {
        return length - lengthShip;
    }

    public void add() {
        if(freeCount() > 0) {
            System.out.println("Имеются дотупные места. Заплыть можно;");
        } else {
            System.out.println("Отсутсвуют свободные места");
        }
    }

    public boolean add(int count) {
        if(freeCount() > count)
            return true;
        else
            return false;
    }

    @Override
    public String toString() {
        return "Shipyard{" +
                "maxShip=" + maxShip +
                ", countShip=" + countShip +
                ", length=" + length +
                ", lengthShip=" + lengthShip +
                '}';
    }
}
