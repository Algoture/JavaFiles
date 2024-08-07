public class Garbage {
    protected void finalize()
    {
        System.out.println("In Finalize Method ");
    }
    public static void main(String[] args) {
        Garbage g1 = new Garbage();
        Garbage g2 = new Garbage();
        new Garbage();
        System.gc();
    }
}
