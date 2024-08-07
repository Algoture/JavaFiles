import java.util.Scanner;

public class LinearSearch {
    static Scanner in = new Scanner(System.in);

    static int min(int array[]) {
        int ans = array[0];
        for(int i =1 ;i<array.length;i++){
            if(array[i]<ans){
                ans=array[i];
            }
        }
        return ans;
    }
    static void linear() {
        int index, n, search, array[];
        // Getting the size of the array
        System.out.println("Enter Size Of The Array :");
        n = in.nextInt();
        array = new int[n];
        // Getting the elements :
        System.out.println("Enter those " + n + " elements");
        for (index = 0; index < n; index++)
            array[index] = in.nextInt();
        // Element to find :
        System.out.println("Enter value to find");
        search = in.nextInt();

        for (index = 0; index < n; index++) {
            if (array[index] == search) /* Searching element is present */
            {
                System.out.println(search + " is present at location " + (index + 1) + ".");
                break;
            }
        }
        if (index == n) /* Element to search isn't present */
            System.out.println(search + " isn't present in array.");
    }

    public static void main(String args[]) {
        int array[]={45,-27,5,28};

        System.out.println( min(array));
    }
}
