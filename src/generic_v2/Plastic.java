package generic_v2;

public class Plastic extends Material {

    @Override
    public String toString() {
        return "재료는 Plastic";
    }

    @Override
    public void doPrinting() {
        System.out.println("플라스틱 프린팅");
    }

}
