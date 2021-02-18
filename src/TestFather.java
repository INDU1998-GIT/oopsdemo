class Father{
	String familyName;
	String houseaddress;
	Father()
	{
		familyName="Programmer";
		houseaddress="Delhi";
		
	}
	
}
class Son extends Father{
	Son(){
		System.out.println("Iam the son");
		System.out.println("My family name is:" +this.familyName + "and I am from" + this.houseaddress);
	}
}
class Daughter extends Father{
	Daughter(){
		System.out.println("I am the Daughter");
		System.out.println("my familyname is:" +this.familyName + " and I am from"+this.houseaddress);
	}
}
public class TestFather {

	public static void main(String[] args) {
		Son s=new Son();
		Daughter d=new Daughter();
		

	}

}
