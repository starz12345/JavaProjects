

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class run {

    public static int solveSuperMarketQueue(int[] customers, int n) {

        int[] result = new int[n];
        for(int i = 0; i < customers.length; i++){
            result[0] += customers[i];
            Arrays.sort(result);
            System.out.println(Arrays.toString(result));
        }
        return result[n-1];

    }

    public static void main(String[] args) {
        solveSuperMarketQueue(new int[] { 2, 2, 3, 3, 4, 4 }, 2);
        //long java8 = "0.01.00.0".chars().filter(ch -> ch.equals("0.0")).count();

        double[] test = Arrays.stream(new double[]{0, 1, 0}).distinct().toArray();
                    System.out.println(test.length);

    }

    public static double findUniq(double arr[]) {
        // Do the magic
        int count = 0;
        double unique = 0;
        for (double a : arr) {
            for (double b : arr) {
                if (a == b) {
                    count++;
                    if (count > 1) break;
                } else {
                    unique = a;
                }
            }
        }
        return unique;
    }

}