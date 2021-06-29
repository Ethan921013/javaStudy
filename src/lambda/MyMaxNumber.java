package lambda;

// 함수형 인터페이스 표기 람다식을 위한..
@FunctionalInterface
public interface MyMaxNumber {

    // 펑셔널에서는 매서드는 하나만 선언해야한다.
    int getMaxNumber(int x , int y);

}
