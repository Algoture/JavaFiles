public class ConOverloading {
    ConOverloading()
    {
        System.out.println("Inside The Constructor");
    }
    ConOverloading(int a, int b)
    {
        System.out.println("Addition : "+(a+b));
    }
    public static void main(String[] args) {
        ConOverloading c = new ConOverloading();
        ConOverloading d = new ConOverloading(5, 2);
    }
}
