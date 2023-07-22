package javaPrograms;
//write the program reverse the given array index using interface
public interface Reverse {
public static void elementReverse(int[] arr)
{         
	for(int i=arr.length-1;i>=0;i--)
	{
		System.out.print(arr[i]+"  ");
		 
	}

}
}
