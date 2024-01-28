public class Main {
    public static void main(String[] args) {
        final  var PORT = 9999;
        Server server = new Server();
        server.start(PORT);
    }
}