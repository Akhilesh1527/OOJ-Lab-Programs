import java.util.*;
class Employee
{
	double empnohrs;
	double empbasic;
	double emphra;
	double empda;
	double empit;
	double empgross;
	String empid;
	String empname;
	
	
	void acceptDetails()
	{
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter the employee details:");
		System.out.println("Enter the employee id:");
		empid=ss.next();
		System.out.println("Enter the employee name:");
		empname=ss.next();
		System.out.println("Enter the number of hours:");
		empnohrs=ss.nextDouble();
		System.out.println("Enter the basic salary:");
		empbasic=ss.nextDouble();
		System.out.println("Enter the HRA:");
		emphra=ss.nextDouble();
		System.out.println("Enter the DA:");
		empda=ss.nextDouble();
		System.out.println("Enter the IT:");
		empit=ss.nextDouble();
	}
	void calculategross()
	{
		empgross=empbasic+ empbasic*(emphra/100.0)+ empbasic*(empda/100.0) - empbasic*(empit/100.0);
		if(empnohrs > 200)
		{
			empgross = empgross + 100*(empnohrs-200);
		}
		else
		{
			empgross = empgross - 100*(200-empnohrs);
		}
		
	}
   void display()
   {
	System.out.println("*****DISPLAYING DETAILS*****\n");
	System.out.println("Name : " +empname);  
	System.out.println("ID : " +empid);
	System.out.println("Gross Salary is : " +empgross);
   }
}
   	
 class Emp_Main
 {
	public static void main(String args[])
	{
		Employee ee= new Employee();
		ee.acceptDetails();
		ee.calculategross();
		ee.display();
	}
}
		
