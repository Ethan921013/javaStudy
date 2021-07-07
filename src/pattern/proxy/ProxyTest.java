package pattern.proxy;

import pattern.proxy.aop.AopBrowser;

import java.util.concurrent.atomic.AtomicLong;

public class ProxyTest {

    public static void main(String[] args) {

//        Browser browser = new Browser("www.naver.com");
//        browser.show();


//        IBrowser browser = new BrowserProxy("www.naver.com");
//        browser.show();
//        browser.show();
//        browser.show();
//        browser.show();

        AtomicLong start = new AtomicLong();
        AtomicLong end = new AtomicLong();

        IBrowser aopBrowser = new AopBrowser("www.naver.com",
                ()->{
                    System.out.println("before");
                    start.set(System.currentTimeMillis());
                },
                ()->{
                    System.out.println("after");
                    long now = System.currentTimeMillis();
                    end.set(now - start.get());
                }
                );

        aopBrowser.show();
        System.out.println("loading time : " + end.get());

    }

}
