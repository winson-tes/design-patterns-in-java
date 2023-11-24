package bridge;

public abstract class SubscriberLevel {
    protected Website website;

    public SubscriberLevel(Website website) {
        this.website = website;
    }

    abstract void showContent();
}
