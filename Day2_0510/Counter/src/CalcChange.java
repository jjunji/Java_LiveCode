
public class CalcChange {

		public void calc(int money, int price){    // 어디서나 호출 가능하게 : public, 반환값 없음 : void / 변수명과 파라미터 정한 후 코드 작성 시작.
		
		int units[] = {5000, 1000, 500, 100, 50, 10};
		
		//거스름돈
		int change = money - price;
		System.out.println("거스름돈 : " + change);
		
		int units_length = units.length;  // 그냥 units.length를 써도 되지만 변수에 넣어 놓고 사용한다. (권고사항) / 이유는 배열의 크기를 처리할 때
																								// 값이 바뀔 수 있기 때문이다.
	  /* for(int i=0; i<units_length; i++){
			change = printChange(change,units[i]);
		}
	  */
		for(int unit : units){   // int a : units 보다는 units(복수) 형태를 단수형태 unit로 명명하는 것이 보기 좋음.
			change = printChange(change, unit);
		}

/*		change = printChange(change, 5000);
		change = printChange(change, 1000);
		change = printChange(change, 500);
		change = printChange(change, 100);
		change = printChange(change, 50);
		change = printChange(change, 10);
*/
		
	}
	
	public int printChange(int change, int unit){
		int count = change / unit;
		change = change - (count * unit);
		System.out.println(unit + "원 권 : " + count + "개");
		return change;
	}
}