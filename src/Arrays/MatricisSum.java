package Arrays;

public class MatricisSum {

	public static void main(String[] args) {
		int[][] a= {{1,2,3},
				    {4,5,6},
				    {7,8,9}};
      int r=3;
      int c=3;
      int psum=0;
      int osum=0;
      for(int i=0;i<r;i++) {
    	  for(int j=0;j<c;j++) {
    		 if(i==j)
    			 psum=psum+a[i][j];
    		 if(a[i][j]==a[i][c-1-i])
    			 osum=osum+a[i][j];
    	  }
      }
    int  sum=psum+osum;
      System.out.println(sum);
	}

}
