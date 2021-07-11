package collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();

        set.add("이순신");
        set.add("봉레테비");
        set.add("ㅋㅋㅋ");


        Iterator<String> iterator = set.iterator();

        while (iterator.hasNext()) {
            String str = iterator.next();
            System.out.println(str);
        }


    }

}
