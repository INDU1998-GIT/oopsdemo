
public class TestDoctor {

	public static void main(String[] args) {
		Specialist spobj=new Specialist("Mary",1234,"New York","Medicine");
		spobj.display();
		NonSpecialist nonspobj=new NonSpecialist("John",5231,"Sydney");
		nonspobj.display();
		

	}

}
