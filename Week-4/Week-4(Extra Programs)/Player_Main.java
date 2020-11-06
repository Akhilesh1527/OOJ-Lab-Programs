import java.util.Scanner;
class player
{
 public int id;
 public String name;
 public int scores[];
 public int no_matches_played;
 player(){}
 void acceptDetails()
 {
  Scanner ss=new Scanner(System.in);
  System.out.println("Enter the Player details\n");
  System.out.println("Enter the Player Id :");
  id=ss.nextInt();
  System.out.println("Enter the player Name :");
  name=ss.next();
  System.out.println("No: of Matches Played :");
  no_matches_played=ss.nextInt();
  scores=new int[no_matches_played];
  for(int i=0;i<no_matches_played;i++)
  {
   System.out.println("Enter the Match Score"+(i+1)+":");
   scores[i]=ss.nextInt();
  }
 }
 void display()
 {
  System.out.println("The Player Details with greater Average Score :");
  System.out.println("Player Id :" +id);
  System.out.println("Player Name :"+name);
  System.out.println("Number of matches played by player :" +no_matches_played);
  for(int i=0;i<no_matches_played;i++)
  {
   System.out.println("The Score in Match"+(i+1)+":"+scores[i]); 
  }
 }
 double calculateAverage()
 {
  double result=0;
  for(int i=0;i<no_matches_played;i++)
  {
   result=result+scores[i];
  }
  return result/no_matches_played;
 }
}
 class Player_Main
 {
  public static void main(String args[])     
  {
   player p1=new player();
   p1.acceptDetails();
   player p2=new player();
   p2.acceptDetails();
   if(p1.calculateAverage()>p2.calculateAverage())
   {
	p1.display();
	System.out.println("The Average Score :" +p1.calculateAverage());
   }
  else	
  {
   p2.display();
   System.out.println("The Average Score :" +p2.calculateAverage());
  }
 }
}   
   
   

 
 
