import java.util.Scanner;
class Trainee //instance class
{
	int tId;
	String tName;
	String technology;
	float salary,stipend;
	void input() //declaring methods	
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter Id,Name,technology & salary of a Trainee :");
				
			
		tId=s.nextInt();
		tName=s.next();
		technology=s.next();
		salary=s.nextFloat();
	}
	float calculate()
	{
		stipend = salary-200;
	return stipend;
	}
	void display()
	{
	System.out.println("********trainee details*******");
	System.out.println("Trainee id:" +tId);
	System.out.println("Trainee name:" +tName);
	System.out.println(" Trainee technology:" +technology);
	System.out.println("Traine salary:" +salary);
}
}
public class TestTrainee {

	public static void main(String[] args) 
	{
		Trainee t1=new Trainee(); //object creation
		Trainee t2=new Trainee();
		t1.input();
		t2.input();
		float s1=t1.calculate();
		float s2=t2.calculate();
		t1.display();
		System.out.println("stipend:" +s1);
	t2.display();
	System.out.println("stipend:" +s2);
		
	}
	

	}


