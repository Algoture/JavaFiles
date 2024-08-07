//Inheritance
class Shape
{
  String color;
}
class Triangle extends Shape
{
    public void area(int base,int height)
    {
      System.out.println(1/2*base*height);
    } 
}
class Equilateral extends Triangle
{
  public void type()
  {
    System.out.println("Equilateral Triangle");
  }
}
class Circle extends Shape
{
  public void area(int radius)
  {
    System.out.println((3.14)*radius*radius);
  }
}
//Types of inheritance (4 types)
public class Inheritance {
  public static void main(String []args)
  {
    Triangle rec = new Triangle();
    rec.color="Green";//Color property got inherit to the Rectangle class from the class Shape 
    System.out.println("Yo !");
    
  }
}
