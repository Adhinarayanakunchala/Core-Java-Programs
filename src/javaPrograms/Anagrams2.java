package javaPrograms;

import java.util.Arrays;
import java.util.Scanner;
public class Anagrams2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="madam";
		String s2="mamad";
		
		// Comparing two Strings
		if(s1.length()==s2.length())
		{
			// Converting Strings into
			// charector
			char[] ch1=s1.toCharArray();
			char[] ch2=s2.toCharArray();
			//converting charectors into
			// Arrays
			
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			if(Arrays.equals(ch1, ch2))
			{
			 System.out.println("Strings are Anagrams");
			}
			else
			{
				System.out.println("Strings are not Anagrams");
			}
			
		}
		else
		{
			System.out.println("Strings are not Anagrams");
		}
		

	}

}
