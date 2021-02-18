
public class Person5 {
	private Job job;//composition has a relationship
	public Person5() {
		this.job=new Job();
		job.setSalary(1000L);
		job.setId(101);
		//job.setRole("manager");(need not to keep all the details,so // is included)
		
	}
	public void dispDetails()
	
	
	{
		System.out.println(job.getId()+"  "+ job.getSalary());
		
	}

}
