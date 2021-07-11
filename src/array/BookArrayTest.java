package array;

public class BookArrayTest {

    public static void main(String[] args) {

        Book[] library = new Book[5];

        library[0] = new Book("재목1", "저자1");
        library[1] = new Book("재목2", "저자2");
        library[2] = new Book("재목3", "저자3");
        library[3] = new Book("재목4", "저자4");
        library[4] = new Book("재목5", "저자5");


        for (int i = 0; i < library.length; i++) {
            library[i].showBookInfo();
        }

    }

}
