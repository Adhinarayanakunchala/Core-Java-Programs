package javaPrograms;

public interface A {
	
 public static int printArray(int arr[],int key)
{
	int index=-1;
	for(int i=0;i<=arr.length-1;i++)
	{
		if(arr[i]==key)
		{
			return arr[i];
		}
		else
		{
			return -1;
		}
	}
	return index;
}
}
