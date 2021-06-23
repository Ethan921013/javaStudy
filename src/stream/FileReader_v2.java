package stream;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileReader_v2 {

    public static void main(String[] args) throws IOException {

        // 문자읽을 시 fileReader
        FileReader fis = new FileReader("reader.txt");

        int i;
        while ( (i = fis.read()) != -1){
            System.out.println((char)i);
        }

        fis.close();

        // 소켓에서 읽을때는 무조건 바이트로 읽기때문에 보조스트림으로 문자열을 읽어줘야한다.

    }

}
