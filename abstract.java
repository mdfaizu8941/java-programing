import java.util.*;
abstract class shape
{
  abstract double rectangleArea(double a,double b);
   abstract double circle(double r);
   abstract double square(double l);
}
class area extends shape{
    double rectangleArea(double a,double b)
    {
          return a*b;
    }
     double circle(double r)
     {
         return 3.14*r*r;
     }
     double square(double l)
     {
         return l*l;
     }
}
public class Main
{
	public static void main(String[] args) {
    shape sp;
    area ob=new area();
    sp=ob;
    System.out.println("The area of rectangle is "+sp.rectangleArea(2,2));
     System.out.println("The area of circle is "+sp.circle(5.0));
      System.out.println("The area of square is "+sp.square(6.0));
	}
}
