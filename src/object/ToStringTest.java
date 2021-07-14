package object;

// 마크업 인터페이스
// 에러발생
class Book implements Cloneable{

    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return this.title + " - " + this.author;
    }

    // 인스턴스 복제
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    // 힙메모리에서 해체될때 가비지 컬렉터에서 매서드를 회수.
    // 리소스의 해체 안닫혔을 소켓을 닫아줌.
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}

public class ToStringTest {

    public static void main(String[] args) throws CloneNotSupportedException {

        Book book = new Book("제목1","저자1");

        // 해당 메모리의 주소값.
        // 오버라이딩으로 재정의 하기전은 주소값.
        System.out.println(book);
        System.out.println();

        // 오버라이드로 재정의 해줌.
        System.out.println(book.toString());

        String str = new String("제목1");

        // toString이 이미 정의가 되어있음. toString은 오브젝트의 매서드를 재정의
        System.out.println(str);

        System.out.println();
        // cloneable 하지않음에도 불구하고 사용을해서 에러 , cloneable 반드시 명시해야함
        Book book2 = (Book)book.clone();
        System.out.println(book2);

    }

}
