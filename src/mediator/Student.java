package mediator;

public class Student implements Colleague {
    SystemMediator systemMediator;
    String name;

    public Student (SystemMediator systemMediator, String name) {
        this.systemMediator = systemMediator;
        this.name = name;
    }

    @Override
    public void sendMessage(String message) {
        System.out.printf("%s has sent message: %s%n", name, message);
        this.systemMediator.relay(this, message);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.printf("Student %s received message: %s%n", name, message);
    }
}
