package stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInput {

    public static void main(String[] args) {

        FileInputStream fis = null;

        try {
            fis = new FileInputStream("input.txt");

            int i;

            // 파일끝 도달시 -1 반환
            while ((i = fis.read()) != -1){
                System.out.println((char)i);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Ending");

    }

}
