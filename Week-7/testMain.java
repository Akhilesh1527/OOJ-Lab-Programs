import java.util.*;
class Student {
	String usn;
	String name;
	int sem;
	void getdetails()
	{
		Scanner ss=new Scanner(System.in);
		System.out.println("ENTER THE STUDENT DETAILS");
		System.out.println("Enter the USN:");
		usn=ss.next();
		System.out.println("Enter the Name:");
		name=ss.next();
		System.out.println("Enter the Semester:");
		sem=ss.nextInt();
	}
}
class Test extends Student {
	 int credits[];
	 int cie[];
     int a;

	void acceptDetails()
	{
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter the Number of Subjects:");
		a=ss.nextInt();
		credits=new int[a];
		cie=new int[a];
		System.out.println("Enter the Credits and Cie Marks of the student in Each Subject : ");
		for(int i=0;i<a;i++)
		{
			credits[i]=ss.nextInt();
			cie[i]=ss.nextInt();
		}
	}
}
class Exam extends Test {
	int see[];
	void Details()
	{
		Scanner ss=new Scanner(System.in);
		see=new int[a];
		System.out.println("Enter SEE marks of student in each subject : ");
		for(int i=0;i<a;i++)
		{
			see[i]=ss.nextInt();
		}
	}
}
class Result extends Exam {
	int marks[];
	double calculate()
	{
		marks=new int[a];
		int b=0,c=0;
		for(int i=0;i<a;i++)
		{
			c=c+credits[i];
			marks[i]=cie[i]+see[i]/2;
			if(marks[i]>=50)
			{
			c=c+(((marks[i]/10)+1)*credits[i]);
			}
			else if(marks[i]>=40 && marks[i]<50)
			{
				b=b+(4*credits[i]);
			}
		}
		return (double)b/c;
	}
}

class testMain {
	public static void main(String args[])
	{
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter the number of students:");
		int n=ss.nextInt();
		Student s[] = new Student[n];
		Test t[]=new Test[n];
		Exam e[]=new Exam[n];
		Result r[]=new Result[n];
		for(int i=0;i<n;i++)
		{
			s[i]=new Student();
			s[i].getdetails();
			t[i]=new Test();
			t[i].acceptDetails();
			e[i]=new Exam();
			e[i].Details();
			r[i]=new Result();
			System.out.println("SGPA of the Student  "+(i+1)+" is :"+r[i].calculate());
		}
	}
}
		
