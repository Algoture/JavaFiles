import java.util.Random;
import java.util.Scanner;
public class ArgRandom {
    static Scanner sc = new Scanner(System.in);
    static Random rd = new Random();
    static void test(String...hey)
    {
        int index=rd.nextInt(hey.length);
        System.out.print(hey[index]+" immediately !");
    }
    static void test2(int...go)
    {
        int yes = rd.nextInt(go.length);
        System.out.println("Your Height is "+go[yes]+" ft");
    }
    static void test3(String...hey)
    {
        int index=rd.nextInt(hey.length);
        System.out.println(hey[index]);
        System.out.println("You Have To Go To ");
    }
    public static void main(String[] args) {
        test3("Umesh","Yogesh","Shesh","Rajesh","Suresh","Mahesh","Sandesh","Gauresh");
        test("Maharashtra","Karnataka","Assam","Gujarat","Uttar Pradesh","Madhya Pradesh","Tamil Nadu","Kerala","Rajasthan","Telangana");
        // test2(1,2,3,4,5,6,7);
    }
}
