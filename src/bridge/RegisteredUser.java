package bridge;

public class RegisteredUser extends SubscriberLevel {
    public RegisteredUser(Website website) {
        super(website);
    }

    @Override
    void showContent () {
        System.out.println("Website: " + website.getName() + ", Subscriber Level: Registered user");
    }
}
