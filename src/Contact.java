
public class Contact {
	void createContact(String name,long num1)
	{
		System.out.println("name is:"+name +"and number is  " + num1);
	}
void createContact(String name,long num1,long num2)
{
	System.out.println("name is :" + name +  "number1 is  " +num1 + "and number2 is  " +num2);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Contact c1=new Contact();
c1.createContact("Indu",7036201189L);
c1.createContact("Sashi",8106296699L,9000313936l);
	}

}
