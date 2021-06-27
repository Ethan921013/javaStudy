package thread;

public class InterruptTest extends Thread {

    @Override
    public void run() {

        int i = 0;

        for (i = 0; i < 100 ; i++){
            System.out.println(i);
        }

        try {
            sleep(5000);
        } catch (InterruptedException e) {
            System.out.println(e);
            System.out.println("wake!");
        }

    }

    public static void main(String[] args) {

        InterruptTest test = new InterruptTest();
        test.start();

        // Exception이 발생해서 바로 빠진다. wake결과가 찍힘
        test.interrupt();

        System.out.println("end");

    }

}
