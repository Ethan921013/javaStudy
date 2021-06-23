package stream;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemIn_v2 {

    public static void main(String[] args) {

        System.out.println("input : ");

        try {
            int read;

            // 엔터전까지 읽어라
            // in은 한바이트씩 밖에 못읽으므로 멀티바이트 처리로..
            // 문자를 읽을수있게 보조스트림을 사용해줘야한다. -> InputStreamReader 바이트를 문자로..

            InputStreamReader isr = new InputStreamReader(System.in);
            while ((read = isr.read()) != '\n'){
                System.out.print((char)read);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
