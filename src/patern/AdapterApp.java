package patern;

public class AdapterApp {
    public static void main(String[] args) {
        Adapter adapter = new Adapter();
        adapter.drawLine();
        adapter.dtawSquare();
    }
}

interface VectorgraphicsInterface{
    void drawLine();
    void dtawSquare();
}

class RasterGraphics{
    void drawRastrLine(){
        System.out.println("Risuem linijy");
    }
    void drawRasterSquare(){
        System.out.println("Risuem kwadrat");
    }
}

class Adapter extends RasterGraphics implements VectorgraphicsInterface{

    @Override
    public void drawLine() {
         drawRastrLine();
    }

    @Override
    public void dtawSquare() {
          drawRasterSquare();
    }
}
