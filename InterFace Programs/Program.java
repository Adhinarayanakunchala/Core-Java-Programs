import java.util.Arrays;
public class Program {
    public static int[] findTemperature(int[] temperatures) {
        int[] result = new int[temperatures.length];
        for (int i = 0; i <= temperatures.length-1; i++) {
            for(int j=i+1; j< temperatures.length; j++){

            if (temperatures[j]>temperatures[i] ) {
                result[i] = j - i;
                 break;
            }
        }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] result = findTemperature(temperatures);
        System.out.println(Arrays.toString(result));
    }
    }
    

