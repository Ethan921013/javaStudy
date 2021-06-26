package others;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileV1 {

    public static void main(String[] args) throws IOException {

        RandomAccessFile rf = new RandomAccessFile("random.txt","rw");

        rf.writeInt(100);
        System.out.println(rf.getFilePointer());

        rf.writeDouble(3.14);
        rf.writeUTF("하잉");

        // 처음 포지션으로 재위치 해줘여함.
        rf.seek(0);
        int i = rf.readInt();
        double d = rf.readDouble();
        String str = rf.readUTF();

        System.out.println(i);
        System.out.println(d);
        System.out.println(str);

        rf.close();

    }

}
