import java.util.Scanner;
public class Kapricoor {
    public static void main(String[] args)
    {
        
        for(int i=0; i<=1000;i++)
        {
            int temp=i*i;
            int r=0;
            if(i>0&&i<=9)
            {
                r=temp%10;
                temp=temp/10;
            }
            else if(i>10&&i<=99)
            {
                r=temp%100;
                temp=temp/100;
            }
            else if(i>100&&i<=999)
            {
                r=temp%1000;
                temp=temp/1000;
            }
            int sum=r+temp;
            if(i==sum){
            System.out.println(i);
            } 
        }
    }
}
