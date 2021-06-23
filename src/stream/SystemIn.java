package stream;

import java.io.IOException;

public class SystemIn {

    public static void main(String[] args) {

        System.out.println("input : ");

        try {
            int read = System.in.read();
            System.out.println(read);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    // input , output + stream이 붙으면 바이트단위.

}
