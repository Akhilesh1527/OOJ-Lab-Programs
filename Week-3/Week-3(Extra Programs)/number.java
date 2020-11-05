import java.util.Scanner;
class number 
{
	public static void main(String args[])
	{
        int pos=0,neg=0,z=0,i,n;
		Scanner ss = new Scanner(System.in);
		System.out.println("Enter the Array Size");
		n = ss.nextInt();
		int []a= new int [n];
		System.out.println("Enter Array elements: \n");
		for(i=0;i<n;i++)
		{
			a[i]=ss.nextInt();
			if(a[i]>0)
			{
		     pos++;
		    } 
			else if(a[i]<0)
			{
			 neg++;
			} 
			else
			{ 
			 z++;
			} 
		}
		
		System.out.println("Number of positive integers"+pos);
		System.out.println("Number of Negative integers"+neg);
		System.out.println("Number of Zeroes"+z);
		
	}
}

