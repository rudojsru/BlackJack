package extend;

abstract class Parent {

    public void print(){
        System.out.println("Parent!!!");
    }
    public static void sticPrint(){
        System.out.println("Static Parent print");
    }

    abstract int demo();
}
