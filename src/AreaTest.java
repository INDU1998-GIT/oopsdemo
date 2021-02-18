import java.util.*;
class Area
{
	int length;
	int breadth;
	int area;
	Scanner s=new Scanner(System.in);
	Area()
	{
		length=0;
		breadth=0;
		
	}
	Area(int l,int b){
		length=l;
		breadth=b;
		
	}
	public void input()
	{
		System.out.println("Enter length");
		length=s.nextInt();
		System.out.println("Enter breadth");
		breadth=s.nextInt();
		
	}
	int returnArea()
	{
		area=length*breadth;
		return area;
	}
	public void print()
	{
		System.out.println("Area is:" +area);
	}
}
public class AreaTest {

	public static void main(String[] args) {
		Area a1=new Area();
		Area a2=new Area();
		Area a3=new Area(5,6);
		a1.input();
		a1.returnArea();
		a1.print();
		a2.input();
		a2.returnArea();
		a2.print();
		a3.returnArea();
		a3.print();
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// TODO Auto-generated method stub

	


