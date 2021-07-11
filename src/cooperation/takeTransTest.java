package cooperation;

public class takeTransTest {

    public static void main(String[] args) {

        Student studentJ = new Student("Jame", 5000);
        Student studentT = new Student("Tomas", 10000);
        Student studentE = new Student("Ethan", 10000);

        Bus bus100 = new Bus(100);
        Bus bus500 = new Bus(500);

        Subway subwaGreen = new Subway(2);
        Subway subwaBlue = new Subway(4);

        Taxi taxi = new Taxi(4885);

        studentE.takeTaxi(taxi);
        studentE.showInfo();
        taxi.showTaxiInfo();

//        studentJ.takeBus(bus100);
//        studentT.takeSubway(subwaGreen);
//        studentJ.showInfo();
//        studentT.showInfo();
//        bus100.showBusInfo();
//        bus500.showBusInfo();
//        subwaBlue.showBusInfo();
//        subwaGreen.showBusInfo();


    }

}
