package thread;

class Bank{

    private int money = 10000;

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    //synchronized method lock
    public void saveMoney(int save){

        // block 방식으로 lock 좀더 선
//        synchronized (this){
//
//        }

        int m = this.getMoney();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        setMoney(m + save);

    }

    public void minusMoney(int minus){
        int m = this.getMoney();

        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        setMoney(m - minus);

    }

}

class Yoo extends Thread{

    @Override
    public void run() {
        // 공유 리소스에다 lock을 건다.
        synchronized (SyncTest.myBank){
            System.out.println("start save");
            SyncTest.myBank.saveMoney(3000);
            System.out.println("save money : " + SyncTest.myBank.getMoney());
        }

    }
}

class YooWife extends Thread{

    @Override
    public void run() {
        synchronized (SyncTest.myBank) {
            System.out.println("start minus");
            SyncTest.myBank.minusMoney(1000);
            System.out.println("minus money : " + SyncTest.myBank.getMoney());
        }
    }

}

public class SyncTest {

    public static Bank myBank = new Bank();

    public static void main(String[] args) throws InterruptedException {

        Yoo yoo = new Yoo();
        yoo.start();

        Thread.sleep(200);

        YooWife yooWife = new YooWife();
        yooWife.start();

    }

}
