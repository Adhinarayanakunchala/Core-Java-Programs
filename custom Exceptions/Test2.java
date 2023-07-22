class Test2 {

    public static void main(String[] args) {
        int[][] arr = {
                { 3, 2, 1 },
                { 6, 5, 4 },
                { 9, 8, 7 }
        };
        int temp;
        int row = 3;
        int col = 3;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i][j] > arr[i][k]) {
                        temp = arr[i][j];
                        arr[i][j] = arr[i][k];
                        arr[i][k] = temp;
                    }
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}