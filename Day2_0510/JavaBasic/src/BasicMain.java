
public class BasicMain {

	public static void main(String[] args) {
		
		/* 1~100까지 짝수 합 구하기 
		  1. 결과 값을 저장할 변수를 선언한다.
		  2. 로직을 수행하고
		  3. 결과 값을 반복문 밖에서 출력한다.
		 
		
		int sum = 0;
								// i++ 를 i=i+1로 작성해도됨. -> 최신 언어에서는 가독성문제로 이렇게 자주 사용한다.
		for(int i = 0; i <= 100; i++){
			if( i % 2 == 0){               // 홀수 합 구할 때 : i%2 !=0  or i%2 == 1
				sum += i;  
			}
		}
			System.out.println("결과 값 :" + sum);
		*/
		
/*		
		int a = 42;
		int b = 25;
		
		System.out.println("결과 값 : " + a + b); // 출력 : 결과 값 : 4225 -> 결과 값(str) + a가 먼저 수행되어 a를 문자형으로 바꿔버림.
		System.out.println("결과 값 : " + (a+b) ); // 출력 : 결과 값 : 67 -> 연산자 우선순위에 따라 괄호 안 수식이 계산됨.
		
		// if문의 경우 해당 조건이 맞으면 그 블럭만 실행이 된다.
		if( a > b ){
			System.out.println("a가 b보다 큽니다.");
		} else if(a == b) {
			System.out.println("a와 b가 같습니다.");
		} else {
			System.out.println("a가 b보다 작습니다.");
		}
		*/
/*		
		//// switch 특성 : 위에서 아래로 판별하다가 맞는 조건이 나타나면 그 조건 밑으로 모두 맞다고 생각하고 전부 실행시킴 -> 때문에 break를 걸어줘야한다.
		switch(a){
			case 42:
				System.out.println("a의 값은 42입니다.");
				break;
			case 43:
			case 44:
			case 45:
				System.out.println("a의 값은 43보다 큽니다.");
				break;
		}
	*/	
		
		
		
		// start부터 end까지 더한 값 구하기
		long start = 0L;
		long end = 9999999999L;
		
		//long result = 0L;
		double result = 0;
		
		for(long i = start; i <= end; i++ ){
			result += i;
		}
			System.out.println(result);
	}

}
