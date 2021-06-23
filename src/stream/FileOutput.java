package stream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutput {

    public static void main(String[] args) {

        // true 는 append
        try(FileOutputStream fos = new FileOutputStream("output.txt" , true)){

            fos.write(65);
            fos.write(66);
            fos.write(67);


        }catch (IOException e){
            System.out.println(e);
        }

    }

}
