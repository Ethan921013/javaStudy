package stream;

import java.util.Arrays;
import java.util.function.BinaryOperator;

class CompareString implements BinaryOperator<String>{

    @Override
    public String apply(String s1, String s2) {

        if(s1.getBytes().length >= s2.getBytes().length){
            return s1;
        }else{
            return s2;
        }

    }
}

public class Reduce {

    public static void main(String[] args) {

        String[] arrStr = {"it's","my","스따일"};

        System.out.println(Arrays.stream(arrStr).reduce("",(s1,s2)->{

            if(s1.getBytes().length >= s2.getBytes().length){
                return s1;
            }else{
                 return s2;
            }

        }));


        // 직접 구현할수도 있다. apply 매서드를 이용 , 새로운 객체를 생성
        System.out.println(Arrays.stream(arrStr).reduce(new CompareString()).get());

    }

}
