
public class Doctor {
	protected String name;
	protected int idnumber;
protected  String address;
 Doctor(){
	 
 }
	 Doctor(final String str,final int num,final String addr)
	 {
		 name=str;
		 idnumber=num;
		 address=addr;
		 
		 }
	 void display()
	 {
		System.out.println("the name is:"+name);
		System.out.println("the number is:"+idnumber);
		System.out.println("the address is:"+address);
		
	 }
	 }



