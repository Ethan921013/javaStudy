package stream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInput_v3 {

    public static void main(String[] args) {

        // auto close
        try (FileInputStream fis = new FileInputStream("input.txt");){

            int i;

            byte[] bs = new byte[10];

            // 파일끝 도달시 -1 반환
            while ((i = fis.read()) != -1){
                // 이렇게 코딩시 버퍼에 가비지가 남는다.
//                for (byte b : bs){
//                    System.out.println(b);
//                }

                for (int k = 0 ; k < i ; k++){
                    System.out.println((char)bs[k]);
                }

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Ending");

    }

}
