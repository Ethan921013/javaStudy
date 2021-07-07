package pattern.singleton;

public class SocketTest {

    public static void main(String[] args) {

        SocketClientTest socketClientTest = new SocketClientTest();
        SocketClientTestV2 socketClientTestV2 = new SocketClientTestV2();

        SocketClient s1 = socketClientTest.getSocketClient();
        SocketClient s2 = socketClientTestV2.getSocketClient();

        System.out.println(s1);
        System.out.println(s2);

    }

}
