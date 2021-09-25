interface First{
	int square(int x);
}
class Calculator{
	public int cube(First f,int x){
		return f.square(x)*x;
	}
}
/**interface Second{
	int sum(int x,int y);
}
interface Third{
	void show();
}

interface Fourth{
	int power(int x,int n);
}**/

public class Lam_da{
	public static void main(String args[]){
		Calculator c=new Calculator();
		System.out.println(c.cube(x -> x*x,10));
		/*First f=new Calculator();
		System.out.println(f.square(10));*/
		//First f=(x) -> {return x*x;};
		//First f=(x) -> x*x;
		/**First f=x -> x*x;
		System.out.println(f.square(19));
		
		Second s = (x,y) -> x+y;
		System.out.println(s.sum(101,202));
		
		Third t = () -> System.out.println ("Show()");
		t.show();
		
		Fourth f2 = (x,n) -> {
			int res=1;
			for(;n>0;n--){
				res = res*x;
			}
			return res;
		};
		System.out.println(f2.power(56,2));**/
	}
}