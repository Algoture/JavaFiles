interface Drawable {
    void draw();
}
class Rectangle implements Drawable {
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}
class Circle implements Drawable {
    public void draw() {
        System.out.println("Drawing Circle");
    }
}
public class InterFace {
    public static void main(String args[]) {
        Drawable d = new Circle();
        d.draw();
        Drawable dd = new Rectangle();
        dd.draw();
        
    }
}