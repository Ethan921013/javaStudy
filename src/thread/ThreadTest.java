package thread;

class MyThread implements Runnable{

    @Override
    public void run() {

        int i;

        for(i=0 ; i < 101 ; i++){

            System.out.print(i + "\t");

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

public class ThreadTest {

    public static void main(String[] args) {

        // Thread는 각각의 작업공간(Context)을 갖게된다.
        // Thread 우선순위 1~10 default 5

        System.out.println("start");

        MyThread runner1 = new MyThread();
        Thread thread1 = new Thread(runner1);
        thread1.start();

        MyThread runner2 = new MyThread();
        Thread thread2 = new Thread(runner2);
        thread2.start();

        // 현재 Thread
        Thread t = Thread.currentThread();
        System.out.println(t);

        System.out.println("end");

    }

}
