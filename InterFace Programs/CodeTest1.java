public class CodeTest1 {
    public static void main(String[] args) {

    int[] n={1234,7654,4567};
      int sum=0;
      int r=0;
      int x=n.length;
      int[] b=new int[x];
    for(int i=0; i<n.length;i++)
    {
        int t=n[i];

        while(t>0)
    {
        sum=t%10;
        r=(r*10)+sum;
        t=t/10;
    }
    b[x-1]=n[i];
      x--;
    }
    for(int i=0;i<x;i++)
    {
        System.out.println(b[i]);
    }
    
}
}
