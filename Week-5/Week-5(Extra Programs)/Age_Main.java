import java.util.Scanner;
class Age
{
  public String name;
  public int years;
  public int months;
  Scanner ss = new Scanner (System.in);
  void acceptDetails ()
  {
    System.out.println ("Enter the Name");
    name = ss.next();
    System.out.println ("Enter the age in years and months");
    years = ss.nextInt ();
    months = ss.nextInt ();
  }
}
class Age_Main
{
  public static void main (String args[])
  {
	int age1,age2;
    Age a1 = new Age();
    a1.acceptDetails();
    Age a2 = new Age(); 
    a2.acceptDetails();
    age1=a1.months+(12*(a1.months));
    age2=a2.months+(12*(a2.months));
    if(age1>age2)
    {
     System.out.println(a1.name + " is elder than " + a2.name);
    }
    else
    {
     System.out.println(a2.name + " is elder than " + a1.name);
    }
  }
}     
    
