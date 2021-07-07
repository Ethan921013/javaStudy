package pattern.singleton;

public class SocketClientTest {

    private SocketClient socketClient;

    public SocketClientTest(){
        this.socketClient = SocketClient.getInstance();
    }

    public SocketClient getSocketClient() {
        return socketClient;
    }
}
