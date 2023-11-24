package decorator;

public class Course implements Content {
    @Override
    public void display() {
        System.out.println("Display some content");
    }
}
