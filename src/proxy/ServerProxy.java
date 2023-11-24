package proxy;

public class ServerProxy implements Server {
    private static Server server;

    @Override
    public void showStats() {
        if (server == null) {
            server = new ServerImplementation();
        }
        server.showStats();
    }
}