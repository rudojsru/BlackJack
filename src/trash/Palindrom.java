package trash;

public class Palindrom {
   static String [] slowo={"m","a","d","a","m"};
  //  static String [] s="madam".split("");
//
    public static void main(String[] args) {
        Palindrom polindrom = new Palindrom();
      /*  if(polindrom.czyPolindrom(slowo, 0, slowo.length-1)==true){
            System.out.println("prawda");
        }else {
            System.out.println("falshe");


        }*/
         System.out.println(polindrom.czyPolindrom(slowo,0,slowo.length-1));
        for (String i:slowo){
            System.out.println("."+i+".");
        }
    }

    private boolean czyPolindrom(String[] s, int i, int length) {
        if (i>=length){
            return true;
        }else if (s[i] != s[length]){
            return false;
        }
        return  true ==(czyPolindrom( s, i+1, length-1));
    }

}
