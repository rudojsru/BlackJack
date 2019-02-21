package trash;

public class FibonaczeRekurencja {
    public static void main(String[] args) {
        int number = 4;
        System.out.println(liczbyFibonaczego(number,1,1));

    }

    private static int liczbyFibonaczego(int number,int a1,int a2) {

        int sum = a1+a2;
        if(number>2) {
            a2 = a1;
            a1=sum;
           return  liczbyFibonaczego(--number,a1,a2);
        }
            return sum;
    }
}
