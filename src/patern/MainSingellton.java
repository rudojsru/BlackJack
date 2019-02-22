package patern;

public class MainSingellton {
    public static void main(String[] args) throws InterruptedException {

      
      final int SIZE =1000;
      Thread t[] = new Thread[SIZE];

        for (int i = 0; i <SIZE ; i++) {
            t[i]= new Thread(new R());
            t[i].start();
        }
        for (int i = 0; i < SIZE; i++) {
            t[i].join();
        }
        System.out.println(Singelton.counter);
    }
}

class R implements Runnable{

    @Override
    public void run() {
        Singelton.getInstance();
    }
}

class Singelton {
public static int counter=0;
    private static Singelton instance= new Singelton();
    private Singelton(){
        counter++;
    };
    public static Singelton getInstance(){
       return instance;
    }
}