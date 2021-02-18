import java.util.*;
public class Student {
 String name;
	 int rollno;
 String course;
	int marks;
	Scanner s;
	Student()
	{
System.out.println("Student Details");	
name=" ";
rollno=0;
marks=0;
course="IT";
s=new Scanner(System.in);
	}
	Student(String n,int a,String c,int m)
	{
		name=n;
		rollno=a;
		course=c;
		marks=m;
	}
	public void input()
	{
		System.out.println("Enter  name:");
		name=s.next();
		System.out.println("Enter rollno:");
		rollno=s.nextInt();
		System.out.println("Enter Marks:");
		marks=s.nextInt();
	}
	public void print()
	{
		System.out.println("name is:"+name);
		System.out.println("rollno is:"+rollno);
		System.out.println("course is:"+course);
		System.out.println("marks "+marks);
		
	}
		
	}
	

	
	
	


