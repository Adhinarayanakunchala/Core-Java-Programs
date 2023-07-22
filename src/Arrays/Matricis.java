package Arrays;

public class Matricis {

	public static void main(String[] args) {
		int[][] a= {{1,2,3},{4,5,6},{7,8,9}};
		int r=3;
		int c=3;
		int count=0;
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				if(a[i][j]==0) {
					{
						count++;
					}
				}
			}
			
		}
		if(count>=(r+c)/2) {
			System.out.println("Given matricis is sparse");
		}
		else
		{
			System.out.println(" is Not sparse");
		}

	}

}
