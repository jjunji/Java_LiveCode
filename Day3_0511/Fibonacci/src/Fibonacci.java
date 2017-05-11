import java.util.ArrayList;

public class Fibonacci {

	int a;
	
	public Fibonacci(){
		a = 1;
		
		System.out.println("Fibonacci 생성자 호출 : a의 값은" + a);
	}
	public ArrayList<Integer> process(int n){
		
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		int a = 0;
		result.add(a);
		//System.out.println(a);
		int b= 1;
		result.add(b);
		//System.out.println(b);
		
		while( a+b <= n){
			int c = a + b;
			//System.out.println(c);
			result.add(c);
			a=b;
			b=c;
			
		}
		return result;
	}
	
//	public void functionNoReturn(){
//		
//	}
//	
//	public int functionWithReturn(){
//		int result = 0;   // 호출하면 result값이 반환됨.
//		
//		return result;
//	}
}
