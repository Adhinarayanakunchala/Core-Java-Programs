import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalTime {
    public static void main(String[] args) {
        DateTimeFormatter obj = DateTimeFormatter.ofPattern("YYYY-MM-dd  HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(obj.format(now));
    }
}
