interface demo
{
    void display();
}
class cone implements demo{
    double r,h;
    public cone(double r , double h)
    {
        this.r=r;
        this.h=h;
    }
   public void display()
    {
        System.out.println("The volumn of cone is "+.33*3.14*r*2*h);
    }
}
class cylinder implements demo{
     double r;
    public cylinder(double r)
    {
        this.r=r;
    }
    public void display()
    {
        System.out.println("The volumn of cylinder is "+.66*3.14*r*r*r);
    }
}
class hemisphere implements demo{
     double r,h;
    public hemisphere(double r,double h)
    {
        this.r=r;
        this.h=h;
    }
   public void display()
    {
        System.out.println("The volumn of hemisphere is "+3.14*r*2*h);
    }
}
class User{
    public static void main(String []st)
    {
        cone co=new cone(5,5);
        cylinder c=new cylinder(5);
        hemisphere h=new hemisphere(5,5);
        demo d;
        d=co;
        d.display();
        d=c;
        d.display();
        d=h;
        d.display();
    }
}
















