import java.util.Comparator;

public class EmployeeEmpidComparator implements Comparator<Employee> {
	
    public int compare(Employee e1,Employee e2) {
    	return e1.getEmpId()-e2.getEmpId();
    }
    
}
