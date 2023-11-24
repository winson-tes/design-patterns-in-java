package proxy;

class Main {
    public static void main(String[] args) {
        ServerProxy server = new ServerProxy();
        server.showStats();

        // lets call it again
        server.showStats();
    }
}