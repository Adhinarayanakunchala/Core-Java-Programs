import java.util.*;
public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username, password;
    
        System.out.print("Enter your username: ");
        username = scanner.nextLine();
    
        System.out.print("Enter your password: ");
        password = scanner.nextLine();
    
        if (username.equals("admin") && password.equals("password")) {
          System.out.println("Welcome!");
        } else {
          System.out.println("Invalid username or password.");
        }
      }
    }
    
    