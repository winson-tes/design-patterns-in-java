package proxy;

public class ServerImplementation implements Server {

    public ServerImplementation() {
        doSomeCrazyThingsBefore();
    }
    
    @Override
    public void showStats() {
       System.out.println("Showing stats");
    }
    
    private void doSomeCrazyThingsBefore() {
        System.out.println("Doing some crazy things to connect!!!");
    }
}