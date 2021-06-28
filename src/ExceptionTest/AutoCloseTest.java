package ExceptionTest;

public class AutoCloseTest {

    public static void main(String[] args) {


        // auto close checking
        try (AutoCloseObj obj = new AutoCloseObj();){

        }catch (Exception e){
            System.out.println(e);
        }

    }

}
