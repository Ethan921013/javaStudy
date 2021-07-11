package cooperation;

public class Taxi {

    int taxiNum;
    int passengerCount;
    int money;

    public Taxi(int taxiNum) {
        this.taxiNum = taxiNum;
    }

    public void take(int money) {
        this.money += money;
        passengerCount++;
    }

    public void showTaxiInfo() {
        System.out.println("수입 : " + money);
    }

}
