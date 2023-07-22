import java.util.Scanner;
public class Code {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while (true) {
        System.out.println("hello");
        System.out.println("Do you continue y/n");
        char ch = sc.next().charAt(0);
        if(ch=='n')
        {
            break;
        }
    }
}
    
}