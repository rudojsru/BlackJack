package trash;

public class Rekurencja {

    public static void main(String[] args) {
        Rekurencja policz = new Rekurencja();
        System.out.println(policz.sum(5));
        System.out.println(policz.multiply(3));
    }


    public int sum(int liczba) {
        if (liczba <= 1) {
            return 1;
        } else {
            return liczba + sum(liczba - 1);
        }
    }

    public  int multiply(int liczba){
        if(liczba <=1){
            return 1;
        }else {
            return liczba *multiply(liczba-1);
        }
    }

}
