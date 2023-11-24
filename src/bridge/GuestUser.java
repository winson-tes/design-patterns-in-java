package bridge;

public class GuestUser extends SubscriberLevel {
    public GuestUser(Website website) {
        super(website);
    }

    @Override
    void showContent () {
        System.out.println("User is a free user");
        website.showContent();
    }
}
