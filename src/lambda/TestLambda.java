package lambda;

interface PrintString{
    void showPrintString(String s1);
}

public class TestLambda {

    public static void main(String[] args) {

        PrintString ps = s1 -> System.out.println(s1);
        ps.showPrintString("test");

        showMyString(ps);

        //returnString().showPrintString("dd");
        PrintString printString = returnString();
        printString.showPrintString("dsfasdf");

    }

    public static void showMyString(PrintString printString){
        printString.showPrintString("haha");
    }

    public static PrintString returnString(){
        return s1 -> System.out.println(s1 + "ffff");
    }


}
