package stream;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_v1 {

    public static void main(String[] args) throws IOException {

        FileWriter fw = new FileWriter("writer.txt");

        fw.write('A');
        char[] buf = {'B','C','D','E','F'};

        fw.write(buf);
        fw.write("헬로");
        fw.write(buf,2,2);
        fw.close();

    }

}
