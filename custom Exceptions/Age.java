class InvalidAgeException extends Exception {
    InvalidAgeException(String msg) {
        super(msg);
    }
}

public class Age {
    public static void main(String[] args) {
        int age = 12;
        try {
            if (age >= 18) {
                System.out.println("Person Can Vote");
            } else {
                throw new InvalidAgeException("Person Cannot Vote");
            }
        } catch (Exception e) {

            System.out.println(e);
        }
    }
}
