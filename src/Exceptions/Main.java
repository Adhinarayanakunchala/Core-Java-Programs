package Exceptions;
import java.util.Scanner;
 
class InvalidAgeException extends Exception
{
	InvalidAgeException(String msg){
		super(msg);
	}
}
class Person
{
	 static void Canvote(int age)throws 
	 InvalidAgeException
	 {
		if(age>=18) {
			System.out.println("Person can vote");
		}
		else {
			  throw new InvalidAgeException("Invalid Age");
		}
	 }
}


public class Main {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter age :");
		int age= sc.nextInt();
		
		try
		{
		Person.Canvote(age);	
		}
		catch(InvalidAgeException e)
		{
		System.out.println("Exception :"+e.getMessage());	
		}
	}
	

}
