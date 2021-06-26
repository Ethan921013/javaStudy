package stream;

import java.io.*;

public class DataStream {

    public static void main(String[] args){

        try (FileOutputStream fos = new FileOutputStream("data.txt");
             DataOutputStream dos = new DataOutputStream(fos);
             FileInputStream fis = new FileInputStream("data.txt");
             DataInputStream dis = new DataInputStream(fis)){

            // 한바이트
            dos.writeByte(100);
            dos.writeChar('B');
            dos.writeUTF("안뇽");

            // 쓴형식 그대로 읽어줘여함. 아닐 시 글자가 깨진다.
            System.out.println(dis.readByte());
            System.out.println(dis.readChar());
            System.out.println(dis.readUTF());

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
