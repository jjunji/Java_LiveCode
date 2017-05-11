
public class BasicSub {

	long start = 0L;
	long end = 9999999999L;
	
	public void compare(){
		
		int a = 2;
		int b = 3;
		
		int c = 5;
		
		if( a < b && a < c){  // 코딩스킬 1. 어떤 기준이 되는 수를 앞에 배치. -> 보다 빠른 연산.
							  // ex) true || 조건    -> ||(or) 은 둘 중 하나만 참이면 참이므로 뒤에는 계산하지 않음. -> 빠른 계산.  
			System.out.println("a는 b와 c보다 작습니다.");
		}
		
		System.out.println(a > b ? true : false); //3항 연산자, 속도에는 차이가 없음. 코딩량이 줄어든다.
	}

	public void casting(){
		int number = 555;
		
		//String num = "1000";
		String num = "1000.35";
		
		double db1 = Double.parseDouble(num);
		
		//int num_temp = Integer.parseInt(num);  //int 클래스만 Integer, 나머지는 기본타입명과 같음 float -> Float
		
		String number_temp = number + ""; // 숫자를 문자로 바꾸는 방법.
		
		System.out.println(number + num);
		//System.out.println(number + num_temp);
		System.out.println(number + db1);
	}
	
	
	public void sumFloat(float a, float b){
		
		//Float : 사용자 정의 타입(객체?)
		/*Float temp_a = a;
		Float temp_b = b;*/
		
		float result = Float.sum(a, b); // Float에 내장된 sum 함수를 이용하면 소수점 연산에서 오차가 줄어든다.
		// float result = a+b;
		
	}
	public void sum(){
		
		
		
	}
	
}
