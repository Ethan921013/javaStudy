package array;

public class CharArray {

    public static void main(String[] args) {

        char[] alpahbets = new char[26];

        char ch = 'A';

        for (int i = 0; i < alpahbets.length; i++) {

//            int temp = (int)ch + i;
//            alpahbets[i] = (char)temp;

            alpahbets[i] = ch++;
        }


        for (int i = 0; i < alpahbets.length; i++) {
            System.out.println(alpahbets[i]);
        }


    }

}
