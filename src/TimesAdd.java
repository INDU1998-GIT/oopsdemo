
public class TimesAdd {
	int hour;
	int min;
	int sec;
	public TimesAdd(int h,int m,int s) {
		hour=h;
		min=m;
		sec=s;
	}
void add(TimesAdd obj2) {
	this.hour+=obj2.hour;
	this.min+=obj2.min;
	this.sec+=obj2.sec;
}
void check() {
if(this.sec>=60) {
	this.min++;
	this.sec=this.sec-60;
}
if(this.min>=60) {
	this.hour++;
this.min=this.min-60;
}
if(this.hour>=24)
{
	this.hour=this.hour-24;
}


}

void display()
{
	System.out.println(this.hour + ":" +this.min + ":" + this.sec);
	
}
	public static void main(String[] args)
	{
		TimesAdd obj1=new TimesAdd(10,45,60);
		TimesAdd obj2=new TimesAdd(3,55,05);
		obj1.add(obj2);
		obj1.check();
		obj1.display();
	}
}

		
		
		
		
		
		
		
		
		
		
		
		
		
		

	
