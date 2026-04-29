//Salary slip should contains basic pay,deduction,hra,pf,bonus and total salary by hand

package homework1;

public class Class4 extends Class3{
	
	public void display()
	{
		System.out.println("The total salary by hand: " + totalSalary);
     }

	public static void main(String[] args) {
		
      Class4 obj = new Class4();
      System.out.println("----Salary Slip Details----");
      
      obj.salary();
      obj.salaryCalculate();
      obj.calculateTotal();
      obj.display();
	}

}
