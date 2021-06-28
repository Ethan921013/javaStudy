package ExceptionTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {

    public Class loadClass(String fileName , String className) throws FileNotFoundException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(fileName);
        Class c = Class.forName(className);
        return c;
    }

    public static void main(String[] args) {

        // 미루는 예외는 호출쪽에서 처리해준다.

        ThrowsException throwsException = new ThrowsException();
        try {
            throwsException.loadClass("b.txt","java.lang.string");
            // multi
            // catch (FileNotFoundException | ClassNotFoundException e) {
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        // multi 처리시에는
        // 최상위 Exception은 맨앞에 걸면 안된다. default exception
        }catch (Exception e){
            System.out.println(e);
        }

        System.out.println("End");

    }

}
