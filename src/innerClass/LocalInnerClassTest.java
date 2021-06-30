package innerClass;

class Outer {

    int outNum = 100;
    static int sNum = 200;

    public Runnable getRunnable(int i) {

        // 상수가 된다.
        // 러너블은 콜할때만 불리지만 run매서드는 언제든 가져다 쓸수있음
        int num = 100;

        class myRunnerable implements Runnable {

            @Override
            public void run() {


                System.out.println(num);
                System.out.println(i);
                System.out.println(outNum);
                System.out.println(Outer.sNum);
            }
        }

        return new myRunnerable();

    }

}

public class LocalInnerClassTest {

    public static void main(String[] args) {

        Outer outer = new Outer();
        Runnable runnable = outer.getRunnable(50);

        runnable.run();

    }

}
