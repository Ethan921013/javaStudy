package stream;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileReader_v1 {

    public static void main(String[] args) throws IOException {

        // 문자읽을 시 fileReader
        // 바이트 단위로 읽는다
        FileInputStream fis = new FileInputStream("reader.txt");

        // 바이트로 읽는 도중 문자열이 필요.. 보조스트림을 활용하여 읽는다.
        InputStreamReader isr = new InputStreamReader(fis);


        int i;
        while ( (i = isr.read()) != -1){
            System.out.println((char)i);
        }

        fis.close();

        // 소켓에서 읽을때는 무조건 바이트로 읽기때문에 보조스트림으로 문자열을 읽어줘야한다.

    }

}
