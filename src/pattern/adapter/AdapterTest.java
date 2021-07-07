package pattern.adapter;

public class AdapterTest {

    public static void main(String[] args) {

        HairDryer hairDryer = new HairDryer();

        connect(hairDryer);

        // 변환이 필요함.
        Cleaner cleaner = new Cleaner();
//        connect(cleaner);

        // adapter를 통해서 인터페이스를 통해서 맞춰준다.
        Electronic110V adapter = new SocketAdaptor(cleaner);
        connect(adapter);

        AirConditioner airConditioner = new AirConditioner();
        Electronic110V airAdapter = new SocketAdaptor(airConditioner);
        connect(airAdapter);

    }

    public static void connect(Electronic110V electronic110V){
        electronic110V.powerOn();
    }

}
