package ExceptionTest;

public class IDFormatTest {

    private String userId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) throws IDFormatException {

        if(userId == null){
            throw new IDFormatException("아이디 null");
        }else if(userId.length() <= 8 || userId.length() >= 20){
            throw new IDFormatException("아이디 자리수 제한");
        }

        this.userId = userId;

    }

    public static void main(String[] args) {

        IDFormatTest idFormatTest = new IDFormatTest();

        String userId = "12321";

        try {
            idFormatTest.setUserId(userId);
        } catch (IDFormatException e) {
            System.out.println(e);
        }

    }

}
