package stream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInput_v2 {

    public static void main(String[] args) {

        // auto close
        try (FileInputStream fis = new FileInputStream("input.txt");){

            int i;

            // 파일끝 도달시 -1 반환
            while ((i = fis.read()) != -1){
                System.out.println((char)i);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Ending");

    }

}
