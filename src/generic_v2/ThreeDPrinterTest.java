package generic_v2;

public class ThreeDPrinterTest {

    public static void main(String[] args) {

        Powder powder = new Powder();
        ThreeDPrinter3 printer = new ThreeDPrinter3();

        printer.setMaterial(powder);

        // 오브젝트를 반환함으로 형변환
        Powder p = (Powder) printer.getMaterial();

    }

}
