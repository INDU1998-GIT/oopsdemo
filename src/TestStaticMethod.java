class student200{
	private int rollno;
	private String name;
	static String college="snist";
	public static void changeCollege()
	{
		college="RVCE";
	 //rollno = 1;
	}
	public student200(int r,String n)
	{
	rollno=r;
	name=n;
	
	}
	public void display()
	{
		System.out.println(rollno + "  "+name+"  "+college);
	}
	
}
public class TestStaticMethod {

	public static void main(String[] args) {
		student200.changeCollege();//call static method without object
		student200 s1=new student200(101,"Raj");
		student200 s2=new student200(102,"Mike");
		student200 s3=new student200(103,"John");
		s1.display();
		s2.display();
		s3.display();
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	
