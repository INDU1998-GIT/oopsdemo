
public class Demo {
	Demo()
	{
		//calling constructor
		this("Java flair");
		
	}
	Demo(String str)
	{
		System.out.println(str);
	}

	public static void main(String[] args) {
		// calling constructor using this keyword
		Demo  d=new Demo();
	}

}
