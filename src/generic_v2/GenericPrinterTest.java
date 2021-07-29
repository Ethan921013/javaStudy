package generic_v2;

public class GenericPrinterTest {

    public static void main(String[] args) {

        Powder powder = new Powder();
        GenericPrinter<Powder> powderGenericPrinter = new GenericPrinter<>();

        powderGenericPrinter.setMaterial(powder);

        // 형변환을 안해줘도된다.
        Powder p = powderGenericPrinter.getMaterial();
        System.out.println(powderGenericPrinter.toString());

        p.doPrinting();

    }

}
