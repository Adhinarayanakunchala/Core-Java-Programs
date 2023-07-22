package javaPrograms;

public class CodeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] n={1234,7654,4567};
	      int sum=0;
	      
	      int x=n.length;
	      int[] b=new int[x];
	    for(int i=0; i<n.length;i++)
	    {
	        int t=n[i];
	        int r=0;

	        while(t>0)
	    {
	        sum=t%10;
	        r=(r*10)+sum;
	        t=t/10;
	    }
	    b[x-1]=r;
	      x--;
	    }
	    
	    for(int i=0;i<b.length;i++)
	    {
	        System.out.println(b[i]);
	    }
	    
	}

}
