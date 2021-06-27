package thread;

import java.util.ArrayList;

class YooLibrary{

    public ArrayList<String> books = new ArrayList<>();

    public YooLibrary() {
        books.add("1");
        books.add("2");
        books.add("3");
    }

    public synchronized String lendBook() throws InterruptedException {

        Thread t = Thread.currentThread();

        // 못빌리면 다시 웨이팅상
        // notifyAll 시 if로 하면 스레드가 다시 잠들지 않아서 while문으로 다시 wait처리해줘야 한다.
        while(books.size() == 0){
            System.out.println(t.getName() + " waiting start.. ");
            wait();
            System.out.println(t.getName() + " waiting end.. ");

        }

        String title = books.remove(0);
        System.out.println(t.getName() + " : " + title + " lend");
        return title;
    }

    public synchronized void returnBook(String title){

        Thread t = Thread.currentThread();

        books.add(title);

        // 모든 스레드가 깨어남 공정성을 부여하기 위해..  notify 시 랜덤하나
        notifyAll();

        System.out.println(t.getName() + " : " + title + " return");

    }

}

class Student extends Thread{

    @Override
    public void run() {
        try {
            String title = LibraryMain.library.lendBook();
            if(title == null){
                return;
            }
            sleep(5000);
            LibraryMain.library.returnBook(title);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class LibraryMain {

    public static YooLibrary library = new YooLibrary();

    public static void main(String[] args) {

        Student st1 = new Student();
        Student st2 = new Student();
        Student st3 = new Student();
        Student st4 = new Student();
        Student st5 = new Student();
        Student st6 = new Student();

        st1.start();
        st2.start();
        st3.start();
        st4.start();
        st5.start();
        st6.start();

    }

}
