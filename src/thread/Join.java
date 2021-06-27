package thread;

class JoinTest extends Thread{

    int start;
    int end;
    int total;

    public JoinTest(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {

        int i;

        for (i = start; i <= end ; i++){
            total += i;
        }

    }
}

public class Join {

    public static void main(String[] args) {

        JoinTest test1 = new JoinTest(1,50);
        JoinTest test2 = new JoinTest(51,100);

        test1.start();
        test2.start();

        try {
            // join으로 동시 싱크가 일어나지 않도록
            test1.join();
            test2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int total = test1.total + test2.total;
        System.out.println("test1 total : " + test1.total);
        System.out.println("test2 total : " + test2.total);
        System.out.println("total : " + total);

    }

}
