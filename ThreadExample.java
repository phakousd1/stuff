package edu.canisius.csc.lsp.exam3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadExample {

    public static void main(String[] args) throws InterruptedException {

        Runnable hellos = () -> {
            for(int i = 0; i <= 1000; i++){
                System.out.println("Hello " + i);
            }
        };

        Runnable goodbyes = () -> {
            for(int i = 0; i <= 1000; i++){
                System.out.println("Goodbye " + i);
            }
        };

        ExecutorService service = Executors.newCachedThreadPool();
        //Thread.sleep(10);
        service.execute(hellos);
        //Thread.sleep(10);
        service.execute(goodbyes);
        //Thread.sleep(10);
        System.out.println("I am done");




    }

}
