import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
       //IntStream.range(0, 100).forEach(n -> System.out.print(fibonacci(n) + " "));

       for(int i = 0; i <= 20; i++) System.out.println(fib(i) + " ");
        fib(3);
    }

    public static long fibonacci(int a){
        return (a == 0)? 0:(( a == 1)? 1:fibonacci(a-1) + fibonacci(a - 2));
    }

    public static long fib(int a){
        if (a == 0) return 0;
        if (a == 1) return 1;
        int sum = 0;
        int t1 = 0;
        int t2 = 1;
        for(int i = 2; i <= a;i++){

            sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
        return sum;
    }
}
