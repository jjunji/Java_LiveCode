
public class BasicSub {

	long start = 0L;
	long end = 9999999999L;
	
	public void compare(){
		
		int a = 2;
		int b = 3;
		
		int c = 5;
		
		if( a < b && a < c){  // �ڵ���ų 1. � ������ �Ǵ� ���� �տ� ��ġ. -> ���� ���� ����.
							  // ex) true || ����    -> ||(or) �� �� �� �ϳ��� ���̸� ���̹Ƿ� �ڿ��� ������� ����. -> ���� ���.  
			System.out.println("a�� b�� c���� �۽��ϴ�.");
		}
		
		System.out.println(a > b ? true : false); //3�� ������, �ӵ����� ���̰� ����. �ڵ����� �پ���.
	}

	public void casting(){
		int number = 555;
		
		//String num = "1000";
		String num = "1000.35";
		
		double db1 = Double.parseDouble(num);
		
		//int num_temp = Integer.parseInt(num);  //int Ŭ������ Integer, �������� �⺻Ÿ�Ը�� ���� float -> Float
		
		String number_temp = number + ""; // ���ڸ� ���ڷ� �ٲٴ� ���.
		
		System.out.println(number + num);
		//System.out.println(number + num_temp);
		System.out.println(number + db1);
	}
	
	
	public void sumFloat(float a, float b){
		
		//Float : ����� ���� Ÿ��(��ü?)
		/*Float temp_a = a;
		Float temp_b = b;*/
		
		float result = Float.sum(a, b); // Float�� ����� sum �Լ��� �̿��ϸ� �Ҽ��� ���꿡�� ������ �پ���.
		// float result = a+b;
		
	}
	public void sum(){
		
		
		
	}
	
}
