import java.util.LinkedList;

public class Test_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           LinkedList<Employee> llist=new LinkedList<>();
          /** llist.add("Hello");
           llist.add("Welcum");
           llist.add("Bye Bye");
           llist.add("Apple");
           llist.add(2,"Third element");
           System.out.println("---"+llist.getFirst()+"---");
           for(int i=0;i<llist.size();i++) {
        	   System.out.println(llist.get(i));
           }**/
           llist.add(new Employee(101,"Ajay",1000,"Sales"));
           llist.add(new Employee(102,"Babu",2000,"Accounts"));
           llist.add(new Employee(103,"Chandhu",3000,"Sales"));
           
           //System.out.println(llist.contains(new Employee(102,"Babu",2000)));
           //System.out.println(llist.remove(new Employee(102,"Babu",2000)));
           for(Employee e : llist) {
        	   System.out.println(e);
           }
           
           
           
	}

}
