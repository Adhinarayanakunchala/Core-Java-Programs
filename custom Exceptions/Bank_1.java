
import java.util.*;

class LowbalenceException extends Exception {
    LowbalenceException(String msg) {
        super(msg);
    }
}

public class Bank_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Balence :");
        double balence = sc.nextDouble();
        System.out.println("EnterWithdrawamount :");
        double withdraw_amt = sc.nextInt();

        try {
            if (withdraw_amt > balence) {
                throw new LowbalenceException("Insuficiant Balence ");
            } else {
                System.out.println("Welcome");
            }
        } catch (Exception e) {

            System.out.println(e);
        }
    }
}
