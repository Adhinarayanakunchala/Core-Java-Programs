import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class CurrentTime{
    public static void main(String[] args) {
        DateTimeFormatter dtf =DateTimeFormatter.ofPattern("dd-mm-yyyy hh:mm:ss");
       LocalDateTime now= LocalDateTime.now();
       System.out.println("Currentdate and Time :"+ dtf.format(now));
    }
}