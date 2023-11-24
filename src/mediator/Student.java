package mediator;

public class Student implements Colleague {
    SystemMediator systemMediator;

    public Student (SystemMediator systemMediator) {
        this.systemMediator = systemMediator; 
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("Student has sent message: " + message);
        this.systemMediator.relay(message);
    }

    @Override
    public void recieveMessage(String message) {
        System.out.println("Student has recieved message: " + message);
    }
}
