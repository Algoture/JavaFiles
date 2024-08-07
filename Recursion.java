import java.util.Scanner;

public class Recursion {
    static Scanner s = new Scanner(System.in);

    static void fun(int n) {
        if (n == 128) {
            System.out.println(128);
            return;
        }
        System.out.println(n);
        fun(n * 2);
    }

    static int fib(int n) {
        if (n <= 1) {
            return n;
        }
        return (fib(n - 1) + fib(n - 2));
    }

    public static void main(String[] args) {
        // fun(1);
        System.out.println(fib(15));

    }
}
