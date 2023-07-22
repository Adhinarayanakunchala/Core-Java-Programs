package javaPrograms;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.print("Eneter Array length");
		
		int arr[]=new int [20];
		int n=sc.nextInt();
		int i;																																																																																																																															
		for( i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.print("Element, Location");
			 int ele=sc.nextInt();
			 int loc=sc.nextInt();
		
		for( i=n;i>=loc;i--) {
			arr[i]=arr[i-1];
		}
		n++;
		arr[i]=ele;
		
		for( i=0;i<n;i++) {
			System.out.println(arr[i]+"\t");
		}
		for( i=loc-1;i<=n;i++) {
			arr[i]=arr[i+1];
		}
		n--;
		for( i=0;i<n;i++) {
			System.out.println(arr[i]+"\t");
		}
	}
	
}
