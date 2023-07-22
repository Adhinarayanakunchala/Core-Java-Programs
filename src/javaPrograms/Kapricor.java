package javaPrograms;

import java.util.Scanner;

public class Kapricor {
	public static void main(String[] args)
    {
        /*Scanner sc= new Scanner(System.in);
        System.out.println("Enter number");
        int i=sc.nextInt(); */
        for(int i=0; i<=1000;i++)
        {
            int temp=i*i;
            int d=0;
            if(i>0&&i<=9)
            {
                d=temp%10;
                temp=temp/10;
            }
            else if(i>10&&i<=99)
            {
                d=temp%100;
                temp=temp/100;
            }
            else if(i>100&&i<=999)
            {
                d=temp%1000;
                temp=temp/1000;
            }
            int sum=d+temp;
            if(i==sum){
            System.out.println(i);
            } 
        }
    }
}
