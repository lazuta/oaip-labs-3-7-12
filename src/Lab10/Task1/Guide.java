package Lab10.Task1;

public class Guide extends Book {
    public Guide(String title, String coverType, String color, String date) {
        super(title, coverType, color, date);
    }

    public Guide() {
    }

    @Override
    public void send() {
        System.out.println("You've uploaded your guide on the internet");
    }

    @Override
    public void checkForTypos() {
        System.out.println("You fixed typos that you've found");
    }

    @Override
    public void openBook() {
        System.out.println("You opened web page where it were posted");
    }

    @Override
    public String toString() {
        return "Guide{" +
                "title='" + title + '\'' +
                ", coverType='" + coverType + '\'' +
                ", color='" + color + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
