package javaPrograms;

import java.util.Scanner;

public class Anagram {
	public static void main(String[] args) {
		// Scanner Class 
		Scanner sc= new Scanner(System.in);
		System.out.println("Enetr Two Strings :");
		String s1=sc.next();
		String s2=sc.next();
		
		int count=0;
		//step 1;
		//compare two Strings Lengths
		if(s1.length()==s2.length())
			//step 2;
		{
			for(int i=0; i<s1.length(); i++)
			{
				char ch1=s1.charAt(i);
				
			//checking each Charactor of Strings;
				//in String S2;
				for(int j=0; j<s2.length(); j++)
				{
					char ch2=s2.charAt(j);
					
					if(ch1==ch2)
					{
						count=1;
						break;
					}
				}
				if(count==0)
				{
					System.out.println("Strings Are Not Anagrams");
				}
			}
			if(count==1)
			{
				System.out.println("Strings are anagarms");
			}
		}
			else
			{
				System.out.println("Strings are not anagrams");
			}

	}

}
