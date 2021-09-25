
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   
		//ArrayList<Integer> list = (ArrayList<Integer>)Arrays.asList(23,456,123,566);
		//List list1=Arrays.asList(123,5,61,34,56);
		int a[]= {45,23,566,2};
		//Arrays.sort(a);
		System.out.println(Arrays.binarySearch(a, 999));
		/**for(int i:a) {
			System.out.println(i+" ");
		}**/
		
		
		/**TreeMap<Employee,String> hm=new TreeMap<Employee,String>(new EmployeeEnameComparator());
		hm.put(new Employee(101,"Ajay",1000,"Sales"),"Sales");
		hm.put(new Employee(102,"Chandhu",3000,"Accounts"),"Accounts");
		hm.put(new Employee(103,"Dinesh",4000,"Sales"),"Sales");
		
		Set<Map.Entry<Employee,String>> set=hm.entrySet();
		for(Map.Entry<Employee,String> s:set) {
			System.out.println(s.getKey()+" "+s.getValue());
		}
		/**map.put("xyz@gmail.com","xyz!23");
		map.put("John@rediff.com", "RedJohn");
		map.put("Somerhing@cool.com","coolsome");
		Set<Map.Entry<String,String>> set=map.entrySet();
		for(Map.Entry<String,String> s:set) {
			System.out.println(s.getKey()+" "+s.getValue());
		}
		/**LinkedHashMap<Employee,String> hm=new LinkedHashMap<>();
		hm.put(new Employee(101,"Ajay",1000,"Sales"),"Sales");
		hm.put(new Employee(102,"Chandhu",3000,"Accounts"),"Accounts");
		hm.put(new Employee(103,"Dinesh",4000,"Sales"),"Sales");
		
		Set<Map.Entry<Employee,String>> set=hm.entrySet();
		for(Map.Entry<Employee,String> s:set) {
			System.out.println(s.getKey()+" "+s.getValue());
		}
		/**Set<String> set = hm.keySet();
		for(String s : set) {
			System.out.println(s+" "+hm.get(s));
		}
		
		
		/**Collection<String> col=hm.values();
		for(String c:col) {
			System.out.println(c);
		}**/

	}

}
