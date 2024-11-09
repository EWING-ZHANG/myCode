package Thread;


import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class ThreadTest {
    //通过工具类 Executors
    public static ExecutorService service =  Executors.newFixedThreadPool(10);
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println("--------start----");
//        Thread thread = new Thread0();
//        thread.start();
//        new Thread(new Runnable0()).start();
        FutureTask<String> futureTask = new FutureTask<>(new Callable0());
        new Thread(futureTask).start();
        //callable 阻塞等待得到结果
        String s = futureTask.get();
        System.out.println(s);
        System.out.println("-----end----");
        String a ="a";




    }
    public static class Thread0 extends Thread{
        @Override//public必须添加才可以 why
        public void run(){
            System.out.println("-----thread0------");
        }

    }
    public static class Runnable0 implements Runnable{

        @Override
        public void run() {
            System.out.println("using runnable");
            for (int i = 0; i < 3; i++) {
                System.out.println(i);
            }
        }
    }
    public static class Callable0 implements Callable{

        @Override
        public String call() throws Exception {
            return "call you";
        }
    }



}
