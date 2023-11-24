package bridge;

class Main {
    public static void main(String[] args) {
        Facebook facebook = new Facebook();
        Instagram instagram = new Instagram();

        RegisteredUser registeredFacebook = new RegisteredUser(facebook);
        GuestUser guestFacebook = new GuestUser(facebook);

        RegisteredUser registeredInstagram = new RegisteredUser(instagram);
        GuestUser guestInstagram = new GuestUser(instagram);

        registeredFacebook.showContent();
        guestFacebook.showContent();

        registeredInstagram.showContent();
        guestInstagram.showContent();

        // add "Twitter / X"
        // subscriber levels are abstracted, so it can be reused, so all that needs to be created is the X/Twitter class
    }
}