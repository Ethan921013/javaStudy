package thread;

import java.io.IOException;

public class TerminateThread extends Thread {

    private boolean flag = false;
    int i ;

    public TerminateThread(String name){
        super(name);
    }

    @Override
    public void run() {

        while (!flag){

            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

        System.out.println(getName() + " end");

    }

    public void setFlag(boolean flag){
        this.flag = flag;
    }

    public static void main(String[] args) throws IOException {

        TerminateThread thread1 = new TerminateThread("A");
        TerminateThread thread2 = new TerminateThread("B");

        thread1.start();
        thread2.start();

        int in;
        while (true){
            in = System.in.read();

            if(in == 'A'){
                thread1.setFlag(true);
            }else if(in == 'B'){
                thread2.setFlag(true);
            }else if(in == 'M'){
                thread1.setFlag(true);
                thread2.setFlag(true);
                break;
            }else{
                System.out.println("again!");
            }
        }

        System.out.println("End");

    }

}
