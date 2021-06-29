package lambda;

public class TestStringConcat {

    public static void main(String[] args) {

        // 변수처럼 대입되어서 사용가능하다.
        StringConcat stc = ( s1 , s2 )-> System.out.println(s1 + " " + s2);

        stc.makeString("hi" , "Ethan");

        // 이런원리로 돌아감 . 아나니머스 함수로..
        StringConcat stc2 = new StringConcat() {
            @Override
            public void makeString(String s1, String s2) {
                System.out.println(s1 + " " + s2);
            }
        };

        stc2.makeString("gg","yo");

    }

}
