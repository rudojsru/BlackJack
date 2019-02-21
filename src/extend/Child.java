package extend;

public class Child extends Parent {
    int k;
   public void childPrint(){

        System.out.println("Hello  baybi");
    }
     public void print(){
         System.out.println(" I am child");
     }

    public static void sticPrint(){
        System.out.println("Static Child print");
    }

    @Override
    int demo() {
       this.k=5;
        return 0;
    }



}
