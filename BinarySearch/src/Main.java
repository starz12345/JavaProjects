import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        int [] array = {2, 5, 12, 0, 6, 7, 111, -5, 88};

        int key = 6;
        int index = 0;

        int found = sequencialSearch(array, 900);

        System.out.println((found != -1)? "Element found at Index " + found : "Element not found");

        int orderedArray [] = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};

        int search = binaraySearch(orderedArray, 0, orderedArray.length -1, 23);

        System.out.println((search != -1)? "Element found at Index " + search : "Element not found");

        search = binarySearch(orderedArray, 23);
        System.out.println((search != -1)? "Element found at Index " + search : "Element not found");

        boolean pal = isPalindrome("madam");
        System.out.println(pal);

        IntStream.range(0, 10).forEach(n -> System.out.println(fun(n, n+1)));
        System.out.println(fun2(100, 80));
        System.out.println(rec(5));
        System.out.println(rec2(1000));

    }

    public static int sequencialSearch(int [] array, int key){

        for (int i = 0; i < array.length; i++){
            if (array[i] == key) return i;
        }

        return -1;
    }

    static int binaraySearch(int [] array, int first, int last, int value){

        System.out.println(Arrays.toString(array));
        int middle = (first + last) / 2;
        System.out.println("Current midlle : " + middle + " value "+ array[middle]);
        if (array[middle] == value) return middle;
        if (first >= last) return -1;
        if (value < array[middle]) return binaraySearch(array, first, middle - 1, value);

        return binaraySearch(array, middle + 1, last, value);
    }

    static int binarySearch(int array[], int value){
        int first = 0;
        int last = array.length -1;
        int middle;

        while (first <= last){
            middle = first + (last - first)/2;
            if (array[middle] == value) return middle;
            if (value < array[middle]){
                last = middle - 1;
            } else {
                first = middle + 1;
            }
        }

        return -1;
    }

    static boolean isPalindrome(String s){
        System.out.println(s);
        if (s.length() <= 1) return true;
        if (s.charAt(0) != s.charAt(s.length()-1)) return false;
        return isPalindrome(s.substring(1, s.length() - 1));
    }

    static int fun(int x, int y){
        System.out.println(x + " " + y);
        if (x == 0) return y;
        return fun(x - 1, x + y);
    }

    static int fun2(int x, int y){
        System.out.println(x + " " + y);
        return (y == 0)? 0: (y % 2 == 0)?fun2(x + x, y/2):fun2(x+x, y/2) + x;
    }

    static int rec(int a){
        return (a == 40)? a : a + rec(a * 2);
    }

    static int rec2(int n){
        return (n > 100)? n - 10: rec2(rec2(n + 11));
    }
}

//a = 4 b = 3
//a = 8 b = 1 + 4
//a = 16 b = 0 + 8
//0        + 8        + 4
//12
//
//a = 5
//5 + 10 + 20 + 40

//n = 99
//n = 110
//n = 100
//n = 111
// n = 101
// n = 91
