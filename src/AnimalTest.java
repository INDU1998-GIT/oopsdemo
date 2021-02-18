class Animal//base class
{
String name;
public void eat()
{
	System.out.println("I can eat");
	
}
}
class Dog extends Animal//inherit from Animal class
{
	public void display()
	{
		System.out.println("my name is:" +name);
	}
}


public class AnimalTest {

	public static void main(String[] args) {
		Dog labrador = new Dog();//object of the sub class
		
	labrador.name="Rohu"; //properties and methods of base class comes into sub class dog
	labrador.display();
	labrador.eat();

	}

}
