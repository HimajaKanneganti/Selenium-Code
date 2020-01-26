package firstJavaPackage;

public class Employee 
{
	String empName;
	String empDesg;
	String empSal;
	String empId;
	public Employee(String empName, String empDesg, String empSal, String empId)
	{
		this.empName=empName;
		this.empDesg=empDesg;
		this.empSal=empSal;
		this.empId=empId;
	}
	public static void main(String[] args) 
	{
		Employee e1=new Employee("Himaja","Software Engineer","3.55lpa","557172");
		System.out.println(e1.empName);
		System.out.println(e1.empDesg);
		System.out.println(e1.empSal);
		System.out.println(e1.empId);
		System.out.println("------------------");
		Employee e2=new Employee("SaiPriya","Project Engineer","3.5lpa","S1");
		System.out.println(e2.empName);
		System.out.println(e2.empDesg);
		System.out.println(e2.empSal);
		System.out.println(e2.empId);
	}

}
