public class Pattern {
    public static void main(String[] args)
    {
        for(int i=1;i<=4;i++){
            for(int j=1;j<=7;j++){
                if(i==4||j==3+i||j==5-i)
                System.out.print("*");
                else
                System.out.print(" ");


            }
            System.out.println();
        }
    }
}
