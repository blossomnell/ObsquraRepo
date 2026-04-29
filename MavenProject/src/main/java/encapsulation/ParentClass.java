package encapsulation;

public class ParentClass {

	private String name;
	private int rollnum;
	
	private String subject;
	private int mark;
	
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}
	
	public void setRollNumber(int rollnum) 
	{
		this.rollnum = rollnum;
	}
	
	public int getRollNumber() 
	{
		return rollnum;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public String getName() 
	{
		return name;
	}
}
