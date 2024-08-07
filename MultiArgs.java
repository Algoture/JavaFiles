public class MultiArgs {
   static int Sum(int...least) {
       int res = 0;
       for (int i = 0; i < least.length; i++) {
           res += least[i];
       }
       return res;
   }
   public static void main(String[]args)
       {
               System.out.println(Sum(5,2,4,5,7));
               // System.out.println();
}

}