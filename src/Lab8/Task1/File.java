package Lab8.Task1;

public class File extends Directory{
    protected double size;
    protected String name;
    protected Directory path;

    public File() {}

    public File(double size, String name, String path) {
        super(path);
        this.size = size;
        this.name = name;
    }

    void create() {
        System.out.println("Файл создан. Путь: " + super.path + this.name);
    }

    void rename(String newName) {
        System.out.println(this.name + " -> " + newName);
    }

    void sout() {
        System.out.println("Содержимое фалйа");
    }

    void del() {
        size = 0;
        name = null;
        path = null;
        System.out.println("Файл удален.");
    }

    @Override
    public String toString() {
        return "File{" +
                "size=" + size +
                ", name='" + name + '\'' +
                ", path=" + path +
                '}';
    }
}
