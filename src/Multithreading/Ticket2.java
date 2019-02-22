package Multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Ticket2 extends Thread {
    private static String name;

    public Ticket2(String name) {
        this.name =name;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(name+": "+i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Main2 {

    public static void main(String[] args) {
        Ticket2 ticket2 = new Ticket2("first");
        Ticket2 ticket3 = new Ticket2("second");
       // ticket2.run();
        //ticket3.run();
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(ticket2);
        executorService.submit(ticket3);

    }
}