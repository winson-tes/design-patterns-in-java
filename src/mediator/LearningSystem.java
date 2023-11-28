package mediator;

import java.util.ArrayList;

public class LearningSystem implements SystemMediator {
    ArrayList<Student> classList = new ArrayList<Student>();

    public void add(Student student) {
        this.classList.add(student);
    }

    public void relay(Student sender, String message) {
        for (var student : classList)  {
            if (!student.equals(sender)) {
                student.receiveMessage(message);
            }
        }
    }
}
