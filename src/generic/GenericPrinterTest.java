package generic;

public class GenericPrinterTest {

    public static void main(String[] args) {

        GenericPrinter<Powder> powderGenericPrinter = new GenericPrinter<>();

        Powder powder = new Powder();
        powderGenericPrinter.setMaterial(powder);

        System.out.println(powderGenericPrinter);


        GenericPrinter<Plastic> plasticGenericPrinter = new GenericPrinter<>();

        Plastic plastic = new Plastic();
        plasticGenericPrinter.setMaterial(plastic);

        System.out.println(plasticGenericPrinter);

        powderGenericPrinter.printing();
        plasticGenericPrinter.printing();


    }

}
