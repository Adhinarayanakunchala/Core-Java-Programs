public class PatternLeftpiramid{
public static void main(String[] args) {
   for(int i=1;i<=10;i++) 
   {
    for(int j=1;j<=10;j++)
    {
        if( j==1&& (i==5)
        ||j==3&&(i>3&&i<7)
        ||j==5 &&(i>2&&i<8)
        ||j==7&&(i>1&&i<9)
        ||j==9&&(i>0&&i<10))
        {
System.out.print("*"+"");
        }
        else
        {   
            System.out.print(" ");
        }
    } 
    System.out.println();
} 
 
}    
}

