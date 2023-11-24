package decorator;

abstract class ContentDecorator implements Content {
    protected Content decoratedContent;

    public ContentDecorator(Content decoratedContent) {
        this.decoratedContent = decoratedContent;
    }

    @Override
    public void display() {
        decoratedContent.display();
    }
}
