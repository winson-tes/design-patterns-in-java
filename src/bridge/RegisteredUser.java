package bridge;

public class RegisteredUser extends SubscriberLevel {
    public RegisteredUser(Website website) {
        super(website);
    }

    @Override
    void showContent () {
        System.out.println("User is a registered user");
        website.showContent();
    }
}
