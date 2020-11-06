import java.util.Scanner;

public class d_array
{
    public static void main(String[] args) 
    {
		int i,a=0,b=0,c=0;
		int n;
        Scanner ss=new Scanner(System.in);
        System.out.println("Enter the Size of the Array:");
        n=ss.nextInt();
        int arr[]=new int[n];
        
        System.out.println("Enter the Array Elements:");
        for(i=0;i<n;i++){
            arr[i]=ss.nextInt();
            if(arr[i]>0)
                a+=1;
            else if(arr[i]<0)
                b+=1;
            else
                c+=1;
        }
        System.out.println("No: of Positve numbers = " +a);
        System.out.println("No: of Negative numbers = " +b);
        System.out.println("No: of Zeroes = " +c);
    }
}
