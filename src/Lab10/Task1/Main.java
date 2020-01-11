package Lab10.Task1;

public class Main {
    public static void main(String[] args) {
        Encyclopedia encyclopedia = new Encyclopedia("Random book", "hard", "yellow", "08-04-2016");
        encyclopedia.openBook();
        encyclopedia.checkForTypos();
        encyclopedia.send();
    }
}
