import java.util.Scanner;
class Actor
{
    int id;
    String name;
    int no_of_movies;
    int no_of_years_exp;
    float average;
    static float highest_average;
    void getDetails()
    {
        System.out.println("Enter the ID :");
        Scanner ss=new Scanner(System.in);
        id=ss.nextInt();
        System.out.println("Enter the Name :");
        name=ss.next();
        System.out.println("Enter the Number of Movies :");
        no_of_movies=ss.nextInt();
        System.out.println("Enter the number of years of experience :");
        no_of_years_exp=ss.nextInt();
    }
    void calculateAverage()
    {
        average=no_of_movies/no_of_years_exp;
    }

}
public class Actor_Main
{
    public static void main(String args[])
    {
        Scanner ss=new Scanner(System.in);
        System.out.println("Enter the Number of Actors :");
        int flag=-1;
        int n,i;
        n=ss.nextInt();
        Actor[] act=new Actor[n];
        Actor.highest_average=0;
        for(i=0;i<n;i++)
        {
            act[i]=new Actor();
            System.out.println("Enter the Details of Actor"+(i+1));
            act[i].getDetails();
            act[i].calculateAverage();
            if(act[i].average>Actor.highest_average)
            {
                Actor.highest_average=act[i].average;
                flag=i;
            }
        }

        System.out.println("The Actor with the Highest Average is "+act[flag].name+" with the Average of : "+act[flag].average);
    }
}

