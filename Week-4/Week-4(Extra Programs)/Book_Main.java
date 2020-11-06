import java.util.Scanner;
class book
{
 public int bookid;
 public String booktitle;
 public double no_of_pages;
 public double year_of_pub;
 public String author;
 public String publisher;
 public double price;

void acceptDetails()
{
 System.out.println("\nEnter Book Details\n");
 Scanner b1=new Scanner(System.in);
 System.out.println("Enter the Bookid :");
 bookid=b1.nextInt();
 System.out.println("Enter the Booktitle :");
 booktitle=b1.next();
 System.out.println("Enter the no: of pages :");
 no_of_pages=b1.nextDouble();
 System.out.println("Enter the Year of published :");
 year_of_pub=b1.nextDouble();
 System.out.println("Enter the Author :");
 author=b1.next();
 System.out.println("Enter the Publisher :");
 publisher=b1.next();
 System.out.println("Enter the price :");
 price=b1.nextDouble();
}

void displayDetails()
{
 System.out.println("\nDisplay Book Details\n");
 System.out.println("Bookid :" +bookid);
 System.out.println("Booktitle :" +booktitle);
 System.out.println("No: of Pages :" +no_of_pages);
 System.out.println("Year of published :" +year_of_pub);
 System.out.println("Name of the Author :" +author);
 System.out.println("Publisher :" +publisher);
 System.out.println("price of the Book :" +price);
}
}
class Book_Main
{
 public static void main(String args[])  
 {
  book b1=new book();
  b1.acceptDetails();
  book b2=new book();
  b2.acceptDetails();
  book b3=new book();
  b3.acceptDetails();
  b1.displayDetails();
  b2.displayDetails();
  b3.displayDetails();
  if((b1.price > b2.price) && (b1.price > b3.price))
  {
   System.out.println("The Booktitle of the most expensive book is :" +b1.booktitle);
  }
  else if((b2.price > b1.price) && (b2.price > b3.price))
  {
   System.out.println("The Booktitle of the most expensive book is :" +b2.booktitle);
  } 
  else
  {
   System.out.println("The Booktitle of the most expensive book is :" +b3.booktitle);
  }
  
  if((b1.no_of_pages < b2.no_of_pages) && (b1.no_of_pages < b3.no_of_pages))
  {
    System.out.println("The Book Details of the Book with least no: of pages :");
    b1.displayDetails();
  }
  else if((b2.no_of_pages < b1.no_of_pages) && (b2.no_of_pages < b3.no_of_pages))
  {
   System.out.println("The Book Details of the Book with least no: of pages :");
   b2.displayDetails();
  }
  else
  {
   System.out.println("The Book Details of the Book with least no: of pages :"); 
   b3.displayDetails();
  }
  
  if((b1.year_of_pub==2020)||(b2.year_of_pub==2020)||(b3.year_of_pub==2020))
  {
   System.out.println("\nThe Count of the books published in the year 2020 is : 1\n");
  }
  else if((b1.year_of_pub==2020)&&(b2.year_of_pub==2020)&&(b3.year_of_pub==2020))
  {
   System.out.println("\nThe Count of the books published in the year 2020 is : 3\n");
  }
  else
  {
   System.out.println("\nThe Count of the books published in the year 2020 is : 2\n"); 
  } 
 }
}  
   
