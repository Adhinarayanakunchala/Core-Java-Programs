public class Love2 {
    public static void main(String[] args) {
       
        for(int i=1; i<=7; i++)
        {
            for(int j=1; j<=30; j++)
            {
                if(i==1&&j>1&&j<7||i==7&&j>1&&j<7
                ||j==4||j==10||i==7&&j>10&&j<17
                ||i==7&&j>20&&j<26||j==20&&i<7||j==26&&i<7)
                System.out.print("@");
                else
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
