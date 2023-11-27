package decorator;

public class Main {
    public static void main(String[] args) {
        Course course = new Course();
        VideoCourseDecorator videoCourse = new VideoCourseDecorator(course);

        System.out.println("----------------");
        course.display();
        System.out.println("----------------");
        videoCourse.display();
        videoCourse.playVideo();
    }
}

