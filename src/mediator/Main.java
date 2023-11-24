package mediator;

public class Main {
    public static void main(String[] args) {
        LearningSystem system = new LearningSystem();
        Student studentOne = new Student(system);
        Student studentTwo = new Student(system);

        system.add(studentOne);
        system.add(studentTwo);

        studentOne.sendMessage("Hello world");
    }
}
