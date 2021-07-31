package ioc;

public class Main {

    public static void main(String[] args) {

        String url = "www.naver.com/books/it?page=10&size=20&name=spring-boot";

//        // base64 encoding
//        IEncoder encoder = new Base64Encoder();
//        String result = encoder.encode(url);
//        System.out.println(result);
//        System.out.println();
//
//        //url encoding
//        IEncoder urlEncoder = new UrlEncoder();
//        String urlResult = urlEncoder.encode(url);
//        System.out.println(urlResult);

        // 외부에서 객체를 주입을 받는형태가 DI
        Encoder encoder = new Encoder(new Base64Encoder());
        String result = encoder.encode(url);
        System.out.println(result);



    }

}
