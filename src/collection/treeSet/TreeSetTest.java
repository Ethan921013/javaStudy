package collection.treeSet;

import java.util.TreeSet;

public class TreeSetTest {

    public static void main(String[] args) {

        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("홍길동");
        treeSet.add("봉레테비");
        treeSet.add("음끔쥐");

        for (String str : treeSet) {
            System.out.println(str);
        }


    }
}
