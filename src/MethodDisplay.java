
public class MethodDisplay { 
	public void display() {
    for (int i = 0; i < 30; i++) {
	      System.out.print("*");
	    }
	  }

	  // method with single parameter
	  public void display(char symbol) {
	    for (int i = 0; i < 30; i++) {
	      System.out.println(symbol);
	    }
	  }
	public static void main(String[] args) {
		MethodDisplay m1=new MethodDisplay();
		m1.display();
		
	
}


	

}
