import java.util.Scanner;
public class bill 
{
	public static void main(String args[])
	{
		Scanner ss = new Scanner(System.in);
		double total,t=0;
		System.out.println("Enter number of items : \n");
		int n=ss.nextInt();
		double []rpi =new double[n];
		int []quantity =new int[n];
		for(int i=0;i<n;i++)
		{
		 System.out.println("Enter the quantity of purchase per item"+(i+1));
		 int q=ss.nextInt();
		 quantity[i]=q;
		 System.out.println("Enter the rate per item for item"+(i+1));
		 double r=ss.nextDouble();
		 rpi[i]=r;
		}
		for(int i=0;i<n;i++)
		{
		 total=rpi[i]*quantity[i];
		 t+=total;
		}
		if(t>=1000)  
		{
		 System.out.println("Discount=5%.Total bill="+t+"Discounted bill="+(t-t*0.05));
		}
		else if(t>=7500)
		{
		 System.out.println("Discount=3%.Total bill="+t+"Discounted bill="+(t-t*0.03));
		}
		else if(t>=5000)
		{
		 System.out.println("Discount=2%.Total bill="+t+"Discounted bill="+(t-t*0.02));
	    }
	    else
	    {
		 System.out.println("No discount.Total bill="+t);
		}
	}
}		 	  
		  
	
