package Lab10.Task1;

public class Encyclopedia extends Book {
    public Encyclopedia(String title, String coverType, String color, String date) {
        super(title, coverType, color, date);
    }

    public Encyclopedia() {
    }

    @Override
    public void send() {
        System.out.println("You've released encyclopedia");
    }

    @Override
    public void checkForTypos() {
        System.out.println("People were checking your encyclopedia");
    }

    @Override
    public void openBook() {
        System.out.println("You've opened encyclopedia");
    }

    @Override
    public String toString() {
        return "Encyclopedia{" +
                "title='" + title + '\'' +
                ", coverType='" + coverType + '\'' +
                ", color='" + color + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
