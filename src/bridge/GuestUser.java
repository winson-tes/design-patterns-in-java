package bridge;

public class GuestUser extends SubscriberLevel {
    public GuestUser(Website website) {
        super(website);
    }

    @Override
    void showContent () {
        System.out.println("Website: " + website.getName() + ", Subscriber Level: Free user");
    }
}
