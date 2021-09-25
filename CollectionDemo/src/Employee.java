
public class Employee implements Comparable<Employee>{
	private int empId;
    private String name;
    private int salary;
    private String department;
       public Employee() {
		super();
	}
	public Employee(int empId, String name, int salary,String department) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		this.department=department;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String toString() {
		return empId+" "+name+" "+salary;
	}
	public boolean equals(Object obj) {
		System.out.println("equals()");
		if(obj instanceof Employee) {
			Employee e = (Employee)obj;
			return empId == e.empId&&salary == e.salary &&name.equals(e.name);
		}
		return false;
	}
	public int hashCode() {
		System.out.println("hashCode()");
		return Integer.valueOf(empId).hashCode()+name.hashCode()+Integer.valueOf(salary);
	}
	@Override
	public int compareTo(Employee e) {
		
		return hashCode()-e.hashCode();
	}
	
}
