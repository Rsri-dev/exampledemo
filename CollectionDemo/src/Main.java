import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ArrayList<String> slist=new ArrayList<String>();
      System.out.println(slist.size());
      System.out.println(slist.isEmpty());
      slist.add("welcum");
      slist.add("Hello");
      slist.add(1,"Apple");
     // slist.set(1, "strawberry");
      //System.out.println(slist.size());
      //System.out.println(slist.isEmpty());  
      //System.out.println("------"+slist.remove("Hello")+"-----");
      /**ArrayList<String> slist1=new ArrayList<String>();
      slist1.add("Hello");
      slist1.add("Humpty");
      slist1.add("world");
      slist1.add("Apple");
     // slist.retainAll(slist1);
      slist.addAll(2,slist1);**/
      Object[] obj=slist.toArray();
      for(int i=0;i<obj.length;i++) {
    	  System.out.println(obj[i]);
    	 
      }
      
      String[] str=null;
      str=slist.toArray(new String[] {});
      for(String s : str) {
    	  System.out.println(s);
      }
     
      
	}

}
