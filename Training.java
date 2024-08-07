public class Training {
    static void methodmulti(int []arrrayone){
        System.out.println("0th Index : "+arrrayone[0]);
    }
    void trial(){
        int [][] array = {{1,2,3,4,5},{6,7,8,9,10}};
        for(int i=0;i<=4;i++){
            for(int j=0;j<=4;j++){
            System.out.print(" "+array[i][j]);
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        // int [] array = {1,2,4,5};
        // methodmulti(array);
    }
}
