public class EvenNumber {
    public static void main(String[] args) {
        
      /*  int limit =100;
       for(int i=2;i<=100;i+=2)
       {
        System.out.println(i);
       }
       */
         for (int i = 0; i <= 10; i++) {
            if ((i & 1) == 0) {
                System.out.println(i + " is even.");
            } else {
                System.out.println(i + " is odd.");
            }
        }
    }
}
