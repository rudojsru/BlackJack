package patern;

interface Image {
    void display();

}

public class Proxy {
    public static void main(String[] args) {
        Image image = new ProxyImage("d:/Real Pictures/Jes.jpj");
       image.display();
    }
}

class RealImage implements Image {

    String file;

    public RealImage(String file) {
        this.file = file;
        load();
    }

    void load() {
        System.out.println("Zagruzka  " + file);
    }

    @Override
    public void display() {
        System.out.println("Prosmotr " + file);
    }
}

class ProxyImage implements Image {

    String file;
    RealImage image;

    public ProxyImage(String file) {
        this.file = file;
    }

    @Override
    public void display() {
        if (image == null) {
            image = new RealImage(file);
        }
        image.display();
    }
}