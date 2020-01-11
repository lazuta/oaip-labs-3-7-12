package Lab10.Task2;

public class Place extends Shipyard {
    public double length;

    public Place(double length) {
        this.length = length;
    }

    public Place(int maxShip, double length, double lengthShip, double length1) {
        super(maxShip, length, lengthShip);
        this.length = length1;
    }

    public Place(int maxPeople, double size, double power, String street, int countShip, int maxShip, double length, double lengthShip, double length1) {
        super(maxPeople, size, power, street, countShip, maxShip, length, lengthShip);
        this.length = length1;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public String checkLenght() {
        return length > (length - super.length) ? "Влезет!" : "Выберите другое швартовное место";
    }

    @Override
    public String toString() {
        return "Place{" +
                "length=" + length +
                '}';
    }
}
