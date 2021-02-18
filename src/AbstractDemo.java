abstract class Animally
{
	abstract void makesound();
	public void eat()
	{
		System.out.println("i can eat");
	}
}
class Dog1 extends Animally
{
	public void makesound() //provide implementation of abstract method
	{
		System.out.println("bark bark");
	}
}
public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Dog1 d1=new Dog1();
d1.makesound();
d1.eat();
	}

}
