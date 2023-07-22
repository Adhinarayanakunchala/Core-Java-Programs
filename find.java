public class find {
    public static void main(String[] args) {
        int x=fact(4);
        System.out.println(x);
    }
    static int fact(int n)
    {
     if(n==0)
     return 1;
     else
     return n*fact(n-1);
    }
}
