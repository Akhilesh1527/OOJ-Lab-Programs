import java.util.Scanner;
import java.util.*;
class Person
{
String n1;
void display(String name)
{
n1=name;
System.out.println("\nThe details of the person are :\nName:"+n1);
}
}
class Employee extends Person
{
int id;
void display(String name,int ID)
{
id=ID;
n1=name;
System.out.println("\nThe details of the employee are : \nName:"+n1+"\nEmployee id:"+id);
}
}


class Student extends Person
{
int usn;
void display(String name,int USN)
{
usn=USN;
n1=name;
System.out.println("\nThe details of the student are : \nName:"+n1+"\nUSN no:"+usn);
}
}
class Teaching extends Employee
{
String j;
void display(String name,int ID,String job)
{
id=ID;
j=job;
n1=name;
System.out.println("\nThe details of the teaching employee is as below:\nName:"+n1+"\nEmployee id:"+id+"\nJob:"+j);
}
}
class NonTeaching extends Employee
{
String j;
void display(String name,int i,String job)
{
id=i;
j=job;
n1=name;
System.out.println("The details of the non-teaching employee is as below:\nName:"+n1+"\nEmployee id:"+id+"\nJob:"+j);
}
}

class UG extends Student
{
int age;
void display(String name,int u,int a1)
{
usn=u;
n1=name;
age=a1;
System.out.println("\nThe details of the UG student is as below:\nName:"+n1+"\nUSN no:"+usn+"\nAge:"+a1);
}
}
class PG extends Student
{
int age;
void display(String name,int u,int a1)
{
usn=u;
n1=name;
age=a1;
System.out.println("The details of the PG student is as below:\nName:"+n1+"\nUSN no:"+usn+"\nAge:"+a1);
}
}
class leaf
{
public static void main(String[] args)
{
Person p=new Person();
Employee e=new Employee();
Student s=new Student();
Teaching t=new Teaching();
NonTeaching nt=new NonTeaching();
UG ug=new UG();
PG pg=new PG();
p.display("Raju");
e.display(p.n1,999);
t.display(p.n1,e.id,"Professor");
nt.display(p.n1,e.id,"Doctor");
s.display(p.n1,11111);
ug.display(p.n1,s.usn,19);
pg.display(p.n1,s.usn,24);
}
}
