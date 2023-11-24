package mediator;

import java.util.ArrayList;

public class LearningSystem implements SystemMediator {
    ArrayList<Student> classList = new ArrayList<Student>();

    public void add(Student student) {
        this.classList.add(student);
    }

    public void relay(String message) {
        for (int i = 0; i < classList.size(); i++)  {
            Student student = classList.get(i);
            student.recieveMessage(message);
        }
    }
}
