import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
public class Code2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("enter number :");
            int n = sc.nextInt();
            if(n%2==0)
                System.out.println(n+" is even");
                else
                System.out.println(n+"is Odd");
                System.out.println("Do you want continue y/n :");
                char ch = sc.next().charAt(0);
                if(ch=='n')
                {
                    break;
                }
        }
    }
}
