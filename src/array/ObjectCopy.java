package array;

public class ObjectCopy {


    public static void main(String[] args) {

        Book[] library = new Book[5];
        Book[] copyLibrary = new Book[5];

        library[0] = new Book("제목1", "저자1");
        library[1] = new Book("제목2", "저자2");
        library[2] = new Book("제목3", "저자3");
        library[3] = new Book("제목4", "저자4");
        library[4] = new Book("제목5", "저자5");

        // 얕은 복사가 일어나서 같이 메모리 주소값을 바라봄.
        System.arraycopy(library, 0, copyLibrary, 0, 5);

//        for( Book book : copyLibrary ){
//
//            book.showBookInfo();
//
//        }

        library[0].setTitle("나무1");
        library[0].setAuthor("봉레테비1");

        for (Book book : copyLibrary) {

            book.showBookInfo();

        }


    }

}
