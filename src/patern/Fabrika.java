package patern;

import java.util.Date;
public class Fabrika {

    public static void main(String[] args) {

        Watch watch = new DigigtalWatch();
        Watch watch2 = new RomeWatch();
        watch.showTime();
        watch2.showTime();
        WatchMaker maker =new DigitalWatchMaker();
        Watch watchessss=  maker.cratwatch();


    }
}

interface Watch {

    void showTime();
}



class DigigtalWatch implements Watch {

    @Override
    public void showTime() {
        System.out.println(new Date());

    }
}

class RomeWatch implements Watch {

    @Override
    public void showTime() {
        System.out.println("XI-VI");
    }
}

interface WatchMaker{
    Watch cratwatch();
}

class DigitalWatchMaker implements WatchMaker{

    @Override
    public Watch cratwatch() {
        return new DigigtalWatch();
    }
}
class RomeWatchMaker implements WatchMaker{

    @Override
    public Watch cratwatch() {
        return new RomeWatch();
    }
}