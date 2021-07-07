package pattern.singleton;

public class SocketClientTestV2 {

    private SocketClient socketClient;

    public SocketClientTestV2(){
        this.socketClient = SocketClient.getInstance();
    }

    public SocketClient getSocketClient() {
        return socketClient;
    }
}
