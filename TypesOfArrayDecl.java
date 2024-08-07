import java.util.Scanner;

public class TypesOfArrayDecl {
    static Scanner s = new Scanner(System.in);

    public static void method1() {
        System.out.println("Enter The Elements :");
        int[][] array = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                array[i][j] = s.nextInt();
            }
        }
        System.out.println("The Elements You Have Entered Are :");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(" " + array[i][j]);
            }
            System.out.println("");
        }

    }

    public static void method2() {
        int[][] arr = new int[3][3];
        arr[0][0] = 45;
        arr[0][1] = 44;
        arr[0][2] = 77;
        arr[1][0] = 21;
        arr[1][1] = 22;
        arr[1][2] = 65;
        arr[2][0] = 25;
        arr[2][1] = 27;
        arr[2][2] = 99;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(" " + arr[i][j]);
            }
            System.out.println();
        }
    }

    public static void method3() {
        int[][] arr = { { 21, 27, 28 }, { 55, 77, 22 }, { 98, 99, 42 } };

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + arr[i][j]);
            }
            System.out.println("");

        }
    }

    public static void method4() {
        int[][] array = { { 21, 22, 23, 24 }, { 11, 12, 13, 14 }, { 41, 42, 43, 44 }, { 51, 52, 53, 54 } };
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                System.out.print(" " + array[i][j]);
            }

            System.out.println("");
        }
    }

    public static void main(String[] args) {
        method4();
    }
}
