//Polymorphism
//Java automatically calls the exact function from the data passed
//Methods having same name
/*Rules For Overloading
 * 1)Must Have different return type
 * 2)Must have different parameters types (data types) or number of arguments
 * 3)Different order of parameters 
 * 4)
 */

class Student
{
  String name;
  int roll;
  int age;
  double percentage;
  public void info(String name,int age)
  {
    System.out.println("Student Name : "+name);
    System.out.println("Student Age : "+age);
  }
  public void info(int roll,double percentage)
  {
    System.out.println("Student Roll Number : "+roll);
    System.out.println("Percentage Obtained : "+percentage);
  }
  public void info(String name, double percentage,int roll)
  {
    System.out.println("Student Name : "+name+" Percentage Obtained : "+percentage+" Roll Number : "+roll);
  }
  //Method Overloading 
}
public class Polymorphism 
{
  public static void main(String []args)
  {
    Student s= new Student();
    s.info("Umesh",21);
    s.roll=35;
    s.percentage=98.9;
    s.info(s.roll,s.percentage);
  }
}
