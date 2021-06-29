package stream;

import java.util.Arrays;

public class IntArray {

    public static void main(String[] args) {

        // stream은 데이터의 흐름이다.

        int[] arr = {1,2,3,4,5};

        int a = Arrays.stream(arr).sum();
        int b = (int)Arrays.stream(arr).count();

        System.out.println(a);
        System.out.println(b);

        // 0 부터 시작하여 하나씩 연산하라. 직접 연산을 지정할수있다.
        System.out.println(Arrays.stream(arr).reduce(0 , (c,d)-> c+d));

    }

}
