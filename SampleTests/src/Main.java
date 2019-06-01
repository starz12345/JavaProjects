import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        int [] array = {1, 1, 1, 1, 1, 1, 1};
        System.out.println(isPrimeHappy(13));


    }

    //No 1
    public static int hasSingleMaximum(int[] array){
        if (array.length == 0) return 0;
        int max = array[0];
        for(int i : array){
            if (i > max){
                max = i;
            }
        }
        int count = 0;

        for (int i : array){
            if (i == max) count++;
        }


        return (count == 1)? 1 : 0;
    }

    //No 2
    static int isStepped(int[] array){

        Set<Integer> test = new HashSet<>();

        for (int i : array) test.add(i);

        int count = 0;

        for (Integer i : test){
            count = 0;
            for ( int j : array){
                if (j == i) count++;
            }
            if (count < 3) return 0;
        }

        for (int i = 0; i < array.length - 1; i++){
            if (array[i] > array[i + 1]) return 0;
        }

        return 1;
    }

    //No 3
    public static int isPrimeHappy(int n){

        int primeSum = 0;
        int primeCounter = 0;

        for (int i = 2; i < n; i++){

            if (isPrime(i)){
                primeSum += i;
                primeCounter++;
            }
        }

        if (primeCounter == 0) return 0;

        if (primeSum % n == 0) return 1;

        return 0;
    }



    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
