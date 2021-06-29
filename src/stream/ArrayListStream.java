package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStream {

    public static void main(String[] args) {

        // stream 보다 빠른 연산처리를 위해서

        List<String> sList = new ArrayList<String>();

        sList.add("aaa");
        sList.add("c");
        sList.add("b");
        sList.add("e");

        Stream<String> stream = sList.stream();

        stream.forEach(s -> System.out.print(s + " "));

        System.out.println();

        // 새로운 스트림을 만들어줘야함.
        sList.stream().sorted().forEach(s -> System.out.print(s + " "));

        System.out.println();

        // 각각의 길이를 가져온다. map
        sList.stream().map(s -> s.length()).forEach(s -> System.out.print(s + " "));

    }

}
