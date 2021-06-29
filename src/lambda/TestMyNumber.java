package lambda;

public class TestMyNumber {

    public static void main(String[] args) {

        // java 8 이후

        MyMaxNumber myMaxNumber = (x, y) -> (x >= y)? x : y ;

        System.out.println(myMaxNumber.getMaxNumber(10,20));

    }

}
