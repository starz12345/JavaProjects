import java.util.Arrays;

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
}
