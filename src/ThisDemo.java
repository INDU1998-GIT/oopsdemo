
public class ThisDemo {
	int instVar;
	ThisDemo(int instVar)
	{
		this.instVar=instVar;
		System.out.println("this reference=" +this);//reference to the current object obj
		
	}

	public static void main(String[] args) {
		ThisDemo obj=new ThisDemo(8);//invokes constructor
		System.out.println("object reference=" +obj);

	}

}
