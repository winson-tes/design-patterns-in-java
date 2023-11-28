package mediator;

public class Main {
    public static void main(String[] args) {
        LearningSystem system = new LearningSystem();
        Student studentOne = new Student(system, "John");
        Student studentTwo = new Student(system, "Jane");

        system.add(studentOne);
        system.add(studentTwo);

        studentOne.sendMessage("Hello world");
    }
}
