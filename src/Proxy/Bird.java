package Proxy;

import java.util.Random;

//class bird implements Flyable
public class Bird implements Flyable {
    @Override
    public void fly() throws InterruptedException {
        System.out.println("The Bird is Flying");
        Thread.sleep(new Random().nextInt(1000));

    }
}
