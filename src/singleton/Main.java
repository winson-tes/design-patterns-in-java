package singleton;

class Main {
    public static void main(String[] args) {
        Teacher teacher = Teacher.getInstance();
        teacher.setName("John");
        teacher.doSomething();

        Teacher someOtherTeacher = Teacher.getInstance();
        someOtherTeacher.setName("Jane");
        someOtherTeacher.doSomething();
    }
}