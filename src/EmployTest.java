import java.util.*;
class Employ{
	int salary;
	int hour;
	Scanner s=new Scanner(System.in);
	void getInfo() {
		System.out.println("enter the salary");
		salary=s.nextInt();
		System.out.println("enter no of hours per day");
		hour=s.nextInt();
		
	}
	void AddSal()
	{
		if(salary<500)
		{
			salary=salary+10;
		}
	}
	void AddWork()
	{
		if(hour>6)
		{
			salary=salary+5;
		}
	}
	void display() {
		System.out.println("final salary is:"+salary);
	}

	
	
}
public class EmployTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employ e1=new Employ();
		e1.getInfo();
		e1.AddSal();
		e1.AddWork();
		e1.display();
		
		

	}

}
