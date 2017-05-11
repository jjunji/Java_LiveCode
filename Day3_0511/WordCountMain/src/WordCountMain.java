
public class WordCountMain {

	public static void main(String[] args) {

		// 1부터 100000까지 8의 개수 구하기. ex) 8808 -> 3개
		WordCountMain main = new WordCountMain();
		System.out.println("100000까지 8의 개수는 " + main.count(10000,8));
	}
	
	public int count(int limit, int target){
		
		int result = 0;
		String unit = target + ""; // int형 + "" 을 함으로써 String타입으로 만든다.
		
		for(int i = 0; i <= limit; i++){
			
		/*		****  charAt() 사용  **** 	
			String temp = i + "";  // 변수 temp에 String타입의 i(숫자)를 담는다.
			int temp_length = temp.length();  // temp_length는 문자의 길이를 나타냄.
			
			for(int j = 0; j < temp_length; j++){
			
				String one = temp.charAt(j) + "";
				
				if(unit.equals(one)){  // unit: 문자 target을 equals() 함수를 이용해 비교한다.
					result = result + 1;  // 개 수를 카운트
				}
			}
		*/
			
		/*		****  split 사용   ****    */	
			String temp = i + "";
			String array[] = temp.split("");  // split("")을 사용해 공백을 기준으로 문자열을 나누고 그 값을 배열에 순서대로 넣는다.
			for(String item : array){
				if(item.equals(unit)){     // 비교 후 같으면 카운트
					result = result + 1;
				}
			}
			
			
		}
		return result; // 최종 result 값을 반환한다.
	}
}
