import java.util.Scanner;
import java.lang.*;
import static java.lang.Math.sqrt;
abstract class Solid
{
double radius;
double height;
abstract void Calculate();
}

class Cylinder extends Solid
{
void Calculate()
{
Scanner ss=new Scanner(System.in);
System.out.println("Enter the Radius of the Cylinder : ");
radius=ss.nextInt();
System.out.println("Enter the Height of the Cylinder : ");
height=ss.nextInt();
double Surfacearea;
double Volume;
Surfacearea=(2*3.14*radius*height)+(2*3.14*radius*radius);
Volume=(3.14*radius*radius*height);
System.out.println("The Surface Area of the Cylinder  : \n"+Surfacearea);
System.out.println("The Volume of the cylinder  : \n"+Volume);
}
}
class Cone extends Solid
{
void Calculate()
{
Scanner ss=new Scanner(System.in);
System.out.println("Enter the Radius of the Cone :\n");
radius=ss.nextInt();
System.out.println("Enter the Height of the Cone :\n");
height=ss.nextInt();
double Surfacearea;
double Volume;
Surfacearea=(3.14*radius)*(radius+sqrt((height*height)+(radius*radius)));
Volume=(3.14*radius*radius*height)/3.0;
System.out.println("The Surface Area of the Cone : "+Surfacearea);
System.out.println("The Volume of the Cone : "+Volume);
}
}
class sphere extends Solid
{
void Calculate()
{
Scanner ss=new Scanner(System.in);
System.out.println("Enter the Radius of Sphere : ");
radius=ss.nextInt();
double Surfacearea;
double Volume;
Surfacearea=4*3.14*radius*radius;
Volume=(4*3.14*radius*radius*radius)/3.0;
System.out.println("The Surface Area of Circle : "+Surfacearea);
System.out.println("The Volume of Circle : "+Volume);
}
}

class Solid_Main
{
public static void main(String args[])
{
int choice;
Scanner ss=new Scanner(System.in);
Cylinder cyl=new Cylinder();
Cone con=new Cone();
sphere sph=new sphere();
while(true){
System.out.println("Enter the Choice of the Shape Whose Surface Area and Volume : \n");
System.out.println("1.Cylinder\n2.Cone\n3.Sphere\n4.Exit");
choice=ss.nextInt();
switch(choice)
{
case 1:
cyl.Calculate();
break;
case 2:
con.Calculate();
break;
case 3:
sph.Calculate();
break;
default:
System.exit(0);
}
}
}
}

