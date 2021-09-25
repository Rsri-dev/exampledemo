import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Set_24 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		 TreeSet<Employee> hm = new TreeSet<>(new EmployeeEmpSal());
	      hm.add(new Employee(101,"Ajay",1000,"Sales"));
	      hm.add(new Employee(102,"Chandhu",3000,"Accounts"));
	      hm.add(new Employee(103,"Dinesh",4000,"Sales"));
	      //System.out.println(hm.add(new Employee(103,"Dinesh",4000,"")));
	      //System.out.println(hm.size());
	     Iterator<Employee> itr = hm.iterator();
	     while(itr.hasNext()) {
	    	 System.out.println(itr.next());
	     }
	      
	      for(Employee s : hm) {
	    	  System.out.println(s);
	      }
      
	}

}
/**
        Employee e1 = new Employee(101,"Ajay",1000);
      Employee e2 = new Employee(101,"Ajay",1000);
      System.out.println(e1.hashCode()+" "+e2.hashCode());
      
      
     
**/