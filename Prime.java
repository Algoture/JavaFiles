//Checks whether the input number is prime number or not !
//Check whether a number is even or odd !
import java.util.Scanner;
public class Prime {
    static void evenodd(int num)
    {
        if(num%2==0)
        {
            System.out.println(num+" is a Even Number ");
        }
        else
        {
            System.out.println(num+" is a Odd Number ");
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter A Number :");
        int num=s.nextInt();
        // evenodd(num);
        if(num%2==0)
        {
            System.out.println(num+" is not a Prime Number");
        }
        else
        {
            System.out.println(num+" is a Prime Number");
        }
        s.close();
    }
}
