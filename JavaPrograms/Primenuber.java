public class Primenuber {
    public static void main(String[] args) {

        // 1 to 100 prime number logic
        /*
         * for (int i = 2; i <= 100; i++) {
         * boolean isPrime = true;
         * for (int j = 2; j <= Math.sqrt(i); j++) {
         * if (i % j == 0) {
         * isPrime = false;
         * break;
         * }
         * }
         * if (isPrime) {
         * System.out.println(i);
         * }
         * }
         */

        int n = 100;
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0)
                    count++;
            }
            if (count == 2)
                System.out.println(i);
        }
    }
}
