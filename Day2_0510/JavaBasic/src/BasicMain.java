
public class BasicMain {

	public static void main(String[] args) {
		
		/* 1~100���� ¦�� �� ���ϱ� 
		  1. ��� ���� ������ ������ �����Ѵ�.
		  2. ������ �����ϰ�
		  3. ��� ���� �ݺ��� �ۿ��� ����Ѵ�.
		 
		
		int sum = 0;
								// i++ �� i=i+1�� �ۼ��ص���. -> �ֽ� ������ ������������ �̷��� ���� ����Ѵ�.
		for(int i = 0; i <= 100; i++){
			if( i % 2 == 0){               // Ȧ�� �� ���� �� : i%2 !=0  or i%2 == 1
				sum += i;  
			}
		}
			System.out.println("��� �� :" + sum);
		*/
		
/*		
		int a = 42;
		int b = 25;
		
		System.out.println("��� �� : " + a + b); // ��� : ��� �� : 4225 -> ��� ��(str) + a�� ���� ����Ǿ� a�� ���������� �ٲ����.
		System.out.println("��� �� : " + (a+b) ); // ��� : ��� �� : 67 -> ������ �켱������ ���� ��ȣ �� ������ ����.
		
		// if���� ��� �ش� ������ ������ �� ���� ������ �ȴ�.
		if( a > b ){
			System.out.println("a�� b���� Ů�ϴ�.");
		} else if(a == b) {
			System.out.println("a�� b�� �����ϴ�.");
		} else {
			System.out.println("a�� b���� �۽��ϴ�.");
		}
		*/
/*		
		//// switch Ư�� : ������ �Ʒ��� �Ǻ��ϴٰ� �´� ������ ��Ÿ���� �� ���� ������ ��� �´ٰ� �����ϰ� ���� �����Ŵ -> ������ break�� �ɾ�����Ѵ�.
		switch(a){
			case 42:
				System.out.println("a�� ���� 42�Դϴ�.");
				break;
			case 43:
			case 44:
			case 45:
				System.out.println("a�� ���� 43���� Ů�ϴ�.");
				break;
		}
	*/	
		
		
		
		// start���� end���� ���� �� ���ϱ�
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
