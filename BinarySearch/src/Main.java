public class Main {

    public static void main(String[] args) {

        int [] array = {2, 5, 12, 0, 6, 7, 111, -5, 88};

        int key = 6;
        int index = 0;

        int found = sequencialSearch(array, 900);

        System.out.println((found != -1)? "Element found at Index " + found : "Element not found");

    }

    public static int sequencialSearch(int [] array, int key){

        for (int i = 0; i < array.length; i++){
            if (array[i] == key) return i;
        }

        return -1;
    }

    int binaraySearch(){
        return -1;
    }
}
