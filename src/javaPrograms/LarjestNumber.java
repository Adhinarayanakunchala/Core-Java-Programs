package javaPrograms;

public class LarjestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x1=246;
		int x2=5;
		 
		 for(int i=x1-1;i>=0;i--)
		 {
			 boolean f=true;
			 int num=i;
		while(num>0)
		{
		int d=num%10;
		if(d==x2)
		{
			f=false;
			break;
		}
		num=num/10;
		}
		if(f==true)
		{
			System.out.print(i);
			break;
		}
		
		 }
	}

}
