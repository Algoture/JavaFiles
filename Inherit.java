class Animal
{
    public void dangerous()
    {
        System.out.println("Dangerous");
    }
}
class Tiger extends Animal
{
    public void magnificent()
    {
        System.out.println("National Animal Of India");
    }
}
public class Inherit {
    public static void main(String[] args) {
        Tiger t = new Tiger();
        t.magnificent();
        t.dangerous();
    }
}
