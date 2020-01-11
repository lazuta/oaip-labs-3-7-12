package Lab10.Task2;

public class Doc extends Plant {
    public int maxShip;
    public double speedRepair;

    public Doc() {}

    public Doc(int countShip, int maxShip, int speedRepair) {
        this.countShip = countShip;
        this.maxShip = maxShip;
        this.speedRepair = speedRepair;
    }

    public Doc(int maxPeople, double size, double power, String street, int countShip, int maxShip, double speedRepair) {
        super(maxPeople, size, power, street, countShip);
        this.maxShip = maxShip;
        this.speedRepair = speedRepair;
    }

    public int getMaxShip() {
        return maxShip;
    }

    public void setMaxShip(int maxShip) {
        this.maxShip = maxShip;
    }

    public double getSpeedRepair() {
        return speedRepair;
    }

    public void setSpeedRepair(int speedRepair) {
        this.speedRepair = speedRepair;
    }

    @Override
    public void math2() {
        super.math2();
    }

    @Override
    protected void income() {
        System.out.println((12 / maxPeople) > 1 ? ("Завод (" + street + ") функционирует прекрасно.") : ("Завод (" + street + ") несет финансовые поетри"));
    }

    @Override
    public String done() {
        return "Продукция готова. Можно отплывать.";

    }

    @Override
    protected double timeDone() {
        return super.timeDone();
    }

    public double timeRepair() {
        return (countShip / speedRepair) * (super.power * 0.1);
    }

    public void repair() {
        super.done();
    }

    @Override
    public String toString() {
        return "Doc{" +
                "countShip=" + countShip +
                ", maxShip=" + maxShip +
                ", speedRepair=" + speedRepair +
                '}';
    }
}
