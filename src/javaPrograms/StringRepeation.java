package javaPrograms;

import java.util.Scanner;

public class StringRepeation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter two Strings");
       String s1=sc.next();
       String s2=sc.next();
       boolean flag=true;
       for(int i=0; i<s1.length(); i++)
       {
    	   char ch1=s1.charAt(i);
    	   int count=0;
    	   for(int j=0; j<s2.length(); j++)
           {
        	   char ch2=s2.charAt(j);
        	   if(ch1==ch2)
        	   {
        		   count++;
        		   break;
        	   }
        	   
           }
    	   if(count==0)
           {
        	 flag=false;  
        	 
        	 System.out.println("Strings are not Equal");
        	 break;
           }
    	   if(true)
           {
    		   System.out.println("Strings are Equal");
    		   
        	   
           } 
    	   else
    	   {
    		   System.out.println("Strings are not Equal");
    	   }
    	   
       }
       
	}

}
