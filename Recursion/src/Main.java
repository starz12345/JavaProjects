import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
        System.out.println("test");

        System.out.println(recursive4(50));
        System.out.println(recurs(19));
        System.out.println(handshake(5));
    }

    public static long recursive(int a){
        return (a <= 1) ? a : a * recursive(a - 1);
    }

    public static BigInteger recursive4(int a){
        return (a <= 1) ? BigInteger.valueOf(a) : BigInteger.valueOf(a).multiply(BigInteger.valueOf(recursive(a - 1)));
    }

    public static long recurs(int a) {
        long fact = a;
        for (int i = a - 1; i >= 1; i--){
            fact *= i;
        }

        return fact;
    }

    public static long handshake(int a) {
        return recursive(a)/ (recursive(2) * recursive(a-2));
    }


}
