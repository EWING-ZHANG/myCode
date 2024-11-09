package Proxy;

public class Bird3 implements Flyable{
    private Bird bird;

    public Bird3(Bird bird) {
        this.bird = bird;
    }

    @Override
    public void fly() throws InterruptedException {
        long start = System.currentTimeMillis();
        bird.fly();
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
