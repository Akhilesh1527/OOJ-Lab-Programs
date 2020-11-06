import java.util.Scanner;
class CircleDemo
{
    double radius;
    double area;
    double perimeter;
    void getDetails()
    {
        System.out.println("Enter the radius:");
        Scanner ss=new Scanner(System.in);
        radius=ss.nextDouble();
    }
    void Area()
    {
        area=3.14*radius*radius;
    }
    void Perimeter()
    {
        perimeter=2*3.14*radius;
    }
    void displayDetails()
    {
        System.out.println("Radius : "+radius);
        System.out.println("Area : "+area);
        System.out.println("Perimeter : "+perimeter);
    }


    public static void main(String args[])
    {
        CircleDemo c=new CircleDemo();
        c.getDetails();
        c.Area();
        c.Perimeter();
        c.displayDetails();
    }
}
