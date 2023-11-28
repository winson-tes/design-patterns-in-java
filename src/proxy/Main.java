package proxy;

class Main {
    public static void main(String[] args) {
        ServerProxy server = new ServerProxy();
        server.showStats();

        // let's call it again
        server.showStats();
    }
}