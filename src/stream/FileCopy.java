package stream;

import java.io.*;
import java.net.Socket;

public class FileCopy {

    public static void main(String[] args) throws IOException {

        long milliseconds = 0;

        try (FileInputStream fis = new FileInputStream("test.zip");
             FileOutputStream fos = new FileOutputStream("testCopy.zip");
             // 읽고 쓰는 속도 엄청빠름.
             BufferedInputStream bis = new BufferedInputStream(fis);
             BufferedOutputStream bos = new BufferedOutputStream(fos)){

            milliseconds = System.currentTimeMillis();

            int i;

            while ( (i = bis.read()) != -1 ){
                bos.write(i);
            }

            milliseconds = System.currentTimeMillis() - milliseconds;

        }catch (IOException e){
            System.out.println(e);
        }

        System.out.println( "시간 : " + milliseconds );


        // 보조스트림은 또다른 스트림도 감싼다.

        Socket socket = new Socket();

        // 데코레이터 패턴

        BufferedReader isr = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        // 채팅기능 등 한줄씩 읽어옴.
        isr.readLine();


    }



}
