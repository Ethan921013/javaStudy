package generic;

public class Plastic extends Material {

    @Override
    public String toString() {
        return "재료는 플라스틱 입니다.";
    }

    @Override
    public void doPrinting() {
        System.out.println("플라스틱 프린팅");
    }
}
