package Multithreading;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Ticket implements Runnable {
  private final String NAME;

    public Ticket(String NAME) {
        this.NAME = NAME;
    }



    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(NAME +": " +i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Main {
    public static void main(String[] args) {
        Ticket firstTicket = new Ticket("Fierst");
        Ticket secondTicket = new Ticket("Second");
      //  firstTicket.run();
        // secondTicket.run();
        ExecutorService executorService = Executors.newFixedThreadPool(2);
         executorService.submit(firstTicket);
         executorService.submit(secondTicket);
    }
}