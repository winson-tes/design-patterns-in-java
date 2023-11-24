package facade;

public class Main {
    public static void main(String[] args) {
        UserFacade userFacade = new UserFacade();
        userFacade.signUp(); // does lots of complicated things relating to signing up
        userFacade.disable(); // does lots of complicated things relating to diabling the user
    }
}
