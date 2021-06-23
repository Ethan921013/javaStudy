package stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutput_v2 {

    public static void main(String[] args) {

        byte[] bs = new byte[26];
        byte data = 65;

        for (int i = 0 ; i < bs.length ; i++){
            bs[i] = data;
            data++;
        }

        // true 는 append
        // output input -> byte 단위 , Reader , Writer -> 문자단위
        try(FileOutputStream fos = new FileOutputStream("output_v2.txt" , true);
            FileInputStream fis = new FileInputStream("output_v2.txt");
            ){

            fos.write(bs);

            int ch;
            while ((ch = fis.read()) != -1){
                System.out.println((char)ch);
            }

        }catch (IOException e){
            System.out.println(e);
        }

    }

}
