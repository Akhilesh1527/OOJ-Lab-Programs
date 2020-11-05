import java.util.Scanner;
class arr1 
{
	public static void main(String args[])
	{
		int even=0;
		int odd=0,i,n;
		Scanner ss = new Scanner(System.in);
		System.out.println("Enter the Size of the array\n");
		n = ss.nextInt();
		int [] a=new int[n];
		System.out.println("Enter the Array elements");
		for(i=0;i<n;i++)
		{
			a[i]=ss.nextInt();
		}
		for(i=0;i<n;i++)
		{	
	     if(i%2==0)
		 even+=a[i];
		 else
		 odd+=a[i];
		}
		
		System.out.println("The Sum of even indices = "+even);
		System.out.println("The Sum of Odd indices= "+odd);
		
	}
}
