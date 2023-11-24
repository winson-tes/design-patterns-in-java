package decorator;

public class VideoCourseDecorator extends ContentDecorator {
    public VideoCourseDecorator(Content decoratedContent) {
        super(decoratedContent);
    }

    @Override
    public void display() {
        super.display();
        playVideo();
    }

    private void playVideo() {
        System.out.println("Playing video");
    }
}
