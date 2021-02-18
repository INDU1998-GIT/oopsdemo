
public class StaticDemo {
	static int count;
	//int count;
	StaticDemo()
	{
		count=count+1;
		
	}
	 static void display()
	{
		System.out.println("the number of objects created is:" +count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticDemo s1=new StaticDemo();
		StaticDemo s2=new StaticDemo();
		StaticDemo s3=new StaticDemo();
		StaticDemo.display(); //syntax of calling static method
		s3.display();//can be called using this syntax
		display();//can be called using this syntax also
		

	}

}
