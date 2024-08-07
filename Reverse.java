public class Reverse {
    public static void main(String[] args) {
        num(5544);
        System.out.println(factorial(5));
    }

    static void num(int n) {
        int reverse = 0, remainder;
        while (n != 0) {
            remainder = n % 10;
            reverse = reverse * 10 + remainder;
            n = n / 10;
        }
        System.out.println(reverse);
    }

    static int factorial(int n) {
        int ans = 1;
        for (int i = 1; i <= n; i++) {
            ans = n * (n - i);
        }
        return ans;
    }
}
