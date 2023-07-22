
public class FactorialofarrayNumbers {
     public static void main(String[] args)
     {
        int[] arr={15,7,5,4,9,3,4,12};

        for(int i=0; i<arr.length;i++)
        {
            int n=arr[i];
            int count=0;
            for(int f=1;f<=n;f++)
            {
               if( n%f==0)
               {
                count++;
               }
            }
            if(count>=2){
                System.out.println(" Factorial number");
               }
               else{
               System.out.println("even number");
               }
            }
        }
    }
     

