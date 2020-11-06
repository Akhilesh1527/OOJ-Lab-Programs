import java.util.Scanner;
abstract class Player
{
String name;
int matches_played;
double average;
abstract void cal_avg(String a,int b,int c);
}
class Batsman extends Player
{
int runs_scored;
void cal_avg(String x,int y,int z)
{
name=x;
matches_played=y;
runs_scored=z;
average=(double)runs_scored/matches_played;
System.out.println("The Averge Runs Scored by "+name+" is "+average);
}
}
class Bowler extends Player
{
int runs_given;
void cal_avg(String d,int e,int f)
{
name=d;
matches_played=e;
runs_given=f;
average=(double)runs_given/matches_played;
System.out.println("The Average Runs Given by "+name+" is "+average);
}
}
class Playermain
{
public static void main(String args[])
{
int m,n,i;
Scanner ss=new Scanner(System.in);
System.out.println("Enter the total number of Batsmen : ");
m=ss.nextInt();
System.out.println("Enter the total number of Bowlers : ");
n=ss.nextInt();
Batsman bat[]=new Batsman[m];
for(i=0;i<m;i++)
{
bat[i]=new Batsman();
System.out.println("Enter the Name :");
bat[i].name=ss.next();
System.out.println("Enter the No: of Matches Played by Batsmen"+(i+1)+":");
bat[i].matches_played=ss.nextInt();
System.out.println("Enter the No: of Runs Scored by Batsmen"+(i+1)+":");
bat[i].runs_scored=ss.nextInt();
}
Bowler bow[]=new Bowler[n];
for(i=0;i<n;i++)
{
bow[i]=new Bowler();
System.out.println("Enter the Name :");
bow[i].name=ss.next();
System.out.println("Enter the No: of Matches Played by Bowler"+(i+1)+":");
bow[i].matches_played=ss.nextInt();
System.out.println("Enter the No: of Runs given by Bowler"+(i+1)+":");
bow[i].runs_given=ss.nextInt();
}
for(i=0;i<m;i++)
{
bat[i].cal_avg(bat[i].name ,bat[i].matches_played,bat[i].runs_scored);
}
for(i=0;i<n;i++)
{
bow[i].cal_avg(bow[i].name ,bow[i].matches_played,bow[i].runs_given);
}
}
}
