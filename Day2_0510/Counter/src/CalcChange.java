
public class CalcChange {

		public void calc(int money, int price){    // ��𼭳� ȣ�� �����ϰ� : public, ��ȯ�� ���� : void / ������� �Ķ���� ���� �� �ڵ� �ۼ� ����.
		
		int units[] = {5000, 1000, 500, 100, 50, 10};
		
		//�Ž�����
		int change = money - price;
		System.out.println("�Ž����� : " + change);
		
		int units_length = units.length;  // �׳� units.length�� �ᵵ ������ ������ �־� ���� ����Ѵ�. (�ǰ����) / ������ �迭�� ũ�⸦ ó���� ��
																								// ���� �ٲ� �� �ֱ� �����̴�.
	  /* for(int i=0; i<units_length; i++){
			change = printChange(change,units[i]);
		}
	  */
		for(int unit : units){   // int a : units ���ٴ� units(����) ���¸� �ܼ����� unit�� ����ϴ� ���� ���� ����.
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
		System.out.println(unit + "�� �� : " + count + "��");
		return change;
	}
}