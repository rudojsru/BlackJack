package extend;

public class Main {

    public static void main(String[] args) {

        Child child = new Child();

        Parent childParent = new Child();

        child.sticPrint();
        childParent.sticPrint();

    }
}
