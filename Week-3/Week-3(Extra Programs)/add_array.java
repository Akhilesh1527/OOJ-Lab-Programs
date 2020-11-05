import java.util.Scanner;
class add_array {
	public static void main(String args[])
	{
		int n,j=0,sum=0,R=0,k=0,min,max,avg;
		Scanner ss= new Scanner(System.in);
		System.out.println("Enter the no: of elements in the array : \n");
		n=ss.nextInt();
		int []a=new int[n];
		int []b=new int[n];
		int []c=new int[n];
		System.out.println("Enter the Array elements\n");
		for(int i=0;i<n;i++)
		{
		 a[i]=ss.nextInt();
		}
		for(int i=0;i<n;i++)
		{ 
			if(a[i]%2==0)
			{	
				c[j]=a[i];
				sum+=a[i];
				j++;
			}
			else
			{
			 b[k]=a[i];
			 k++;
			}
	   }
	    max=c[0];
	    min=c[0];
	    for(int i=0;i<j;i++)		
	    {
		 if(c[i]>max)
		 {
		  max=c[i];
		 }
		 if(c[i]<min)
		 {
		  min=c[i];
		 }
	    }
	    System.out.println("For the even array sum is "+sum+"average is"+(sum/j)+"maximum is"+max+"minimum is"+min);
	 }
}	    	    	
			
