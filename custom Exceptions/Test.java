public class Test {
    public static void main(String[] args) {

        int[][] arr = new int[3][3];
        System.out.println("Enter Elements");
        for (int i = 0; i < 3; i++) {
            int rsum = 0;
            for (int j = 0; j < 3; j++) {
                rsum = rsum + arr[i][j];
            }
            System.out.println(rsum);
        }

    }
}
