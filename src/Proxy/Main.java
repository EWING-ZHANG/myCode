package Proxy;

public class Main {
    public static void main(String[] args) throws InterruptedException {
/*        Bird2 bird2 = new Bird2();
        bird2.fly();*/
        Bird3 bird3 = new Bird3(new Bird());
        bird3.fly();
    }
}
