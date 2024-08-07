import java.util.Scanner;

public class Calculator {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("1)Multiplication\n2)Addition\n3)Subtraction\n4)Division\n");
        System.out.println("Enter Your Choice :");
        int choice = s.nextInt();
        Normal n = new Normal();
        switch (choice) {
            case 1:
                n.in();
                System.out.println("The Multiplication Of " + n.a + " and " + n.b + " is " + n.multi());
                break;
            case 2:
                n.in();
                System.out.println("The Addition Of " + n.a + " and " + n.b + " is " + n.add());
                break;
            case 3:
                n.in();
                System.out.println("The Subtraction Of " + n.a + " and " + n.b + " is " + n.sub());
                break;
            case 4:
                System.out.println("Enter First Number :");
                n.c = s.nextDouble();
                System.out.println("Enter Second Number :");
                n.d = s.nextDouble();
                System.out.println("The Division Of " + n.c + " and " + n.d + " is " + n.div());
                break;

            default:
                System.out.println("Wrong Input !");
                break;
        }
    }
}

class Normal {
    static Scanner s = new Scanner(System.in);
    int a, b;
    double c, d;
    int add() {
        return a + b;
    }
    void in() {
        System.out.println("Enter First Number :");
        a = s.nextInt();
        System.out.println("Enter Second Number :");
        b = s.nextInt();
    }
    int sub() {
        return a - b;
    }
    double div() {
        if (c == 0 || d == 0) {
            return 0;
        } else
            return (c / d);
    }
    int multi() {
        return a * b;
    }

}