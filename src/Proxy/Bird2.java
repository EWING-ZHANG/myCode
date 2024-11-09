package Proxy;

public class Bird2 extends Bird{
    public Bird2() {
    }

    @Override
    public void fly() throws InterruptedException {
        long start = System.currentTimeMillis();
        super.fly();
        long end = System.currentTimeMillis();

        System.out.println(end-start);
    }
}
