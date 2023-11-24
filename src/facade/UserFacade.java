package facade;

public class UserFacade {
    private Roles roles = new Roles();
    private AddressBook address = new AddressBook();
    private ContactController contactController = new ContactController();

    public void signUp() {
        roles.addRole("SOME_ROLE");
        contactController.on();
        address.setFirstLine("123 Fake Street");
        // does lots of things
    }

    public void disable() {
        roles.addRole("DISABLED_ROLE");
        contactController.off();
        address.clearAll();
        // does lots of things
    }
}
