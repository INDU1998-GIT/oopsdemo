import java.util.*;
class Empl
{
	String name;
	int year;
	String address;
	 static int salary;
	Scanner s=new Scanner(System.in);
	Empl()
	{
		System.out.println("Employee details");
		name=" ";
		year=0;
		salary=30000;
		address=" ";
		
		
		
	}
	Empl(String n,int a,String addr)
	{
		name=n;
		year=a;
		address=addr;
	}
	public void input()
	{
		System.out.println("enter name,year,address");
		name=s.next();
		year=s.nextInt();
		address=s.next();
			
	}
	public void display()
	{
		System.out.println("salary is:"+salary);
	}
	public void print()
	{

		System.out.println(name+"    "+ year+ "  \t  "+address);
		
	}
	
	
}
public class Empltest {

	public static void main(String[] args) {
		Empl e=new Empl();
		Empl e1=new Empl("Robert",1994,"64c-wallstret");
		Empl e2=new Empl("Sam",2000,"68D-wallstreet");
		Empl e3=new Empl("John",1999,"26B-wallstreet");
		e.input();
		e.display();
		System.out.println("name    "+ "year   "+  "Address"    );
		e.print();
		e1.print();
		e2.print();
		e3.print();
		e1.display();
		e2.display();
		e3.display();

	}

}
