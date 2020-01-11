package Lab10.Task1;

public abstract class Book implements Publication {
    protected String title;
    protected String coverType;
    protected String color;
    protected String date;

    public Book(String title, String coverType, String color, String date) {
        this.title = title;
        this.coverType = coverType;
        this.color = color;
        this.date = date;
    }

    public Book() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCoverType() {
        return coverType;
    }

    public void setCoverType(String coverType) {
        this.coverType = coverType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", coverType='" + coverType + '\'' +
                ", color='" + color + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
