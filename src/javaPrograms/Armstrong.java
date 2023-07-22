package javaPrograms;
import java.util.*;
public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.println("Eneter number...");
     int n=sc.nextInt(); //we taken n value
     int temp=n; // store the n value in to temp
     int count=0;
     int sum=0;
     while(n>0) //n value bigger then zero
     {
    	n=n/10; //it  will gives quosient value
    	count++; //one digit is removed so count=1
     }
     n=temp; // supose we take n =temp
     while(n>0)
     {
    	 int r=n%10; //it will gives remainder 
    	 int s=1; 
    	 //is comman veriable it stores the number cout digits
    	 
    	 for(int i=0;i<count;i++) //itarate the loop
    	 {
    		 s=s*r; //we multiple the r into s and store into s
    	 }
    	 sum=sum+s; //adding s value into sum
    	 n=n/10;   
     }
     if(temp==sum) // we cipare the sum and temp 
    	          // if both are equal number is anagram
    	 System.out.println("Armstrong");
     else
    	 System.out.println("Not Armstrong");//not equal
	}

}
