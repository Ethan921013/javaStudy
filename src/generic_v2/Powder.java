package generic_v2;

public class Powder extends Material {

    @Override
    public String toString() {
        return "재료는 Powder";
    }

    @Override
    public void doPrinting() {
        System.out.println("파우더 프린팅");
    }
}
