
//Basic Calculator
import java.util.Scanner;

public class Calculator2 {
    static Scanner s = new Scanner(System.in);

    static void add() {
        System.out.println("Enter The First Number :");
        int a = s.nextInt();
        System.out.println("Enter The Second Number :");
        int b = s.nextInt();
        int sum = a + b;
        System.out.println("The Sum Of " + a + " and " + b + " is " + sum);
    }

    static void sub() {

        System.out.println("Enter The First Number :");
        int a = s.nextInt();
        System.out.println("Enter The Second Number :");
        int b = s.nextInt();
        int diff = a - b;
        System.out.println("The Subtraction Of " + a + " and " + b + " is " + diff);
    }

    static void multi() {

        System.out.println("Enter The First Number :");
        int a = s.nextInt();
        System.out.println("Enter The Second Number :");
        int b = s.nextInt();
        int multi = a * b;
        if (b == 0) {
            System.out.println("Multiplication Not Possible");
        } else {
            System.out.println("The Multiplication Of " + a + " and " + b + " is " + multi);

        }
    }

    static void div() {
        System.out.println("Enter The First Number :");
        double a = s.nextDouble();
        System.out.println("Enter The Second Number :");
        double b = s.nextDouble();
        double div = a / b;
        if (b == 0) {
            System.out.println("Division Not Possible ");
        } else {
            System.out.println("The Division Of " + a + " and " + b + " is " + div);
        }
    }

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("1)Addition\n2)Subtraction\n3)Division\n4)Multiplication\n5)Exit");
            choice = s.nextInt();
            switch (choice) {
                case 1:
                    add();
                    break;
                case 2:
                    sub();
                    break;
                case 3:
                    div();
                    break;
                case 4:
                    multi();
                    break;
                case 5:
                    System.out.println("Thank You For Using Our Service !");
                    break;
                default:
                    System.out.println("Invalid Input !");
            }

        } while (choice != 5);
    }

}
