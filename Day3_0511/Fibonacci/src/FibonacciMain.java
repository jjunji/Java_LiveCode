import java.util.ArrayList;

public class FibonacciMain {

	public static void main(String[] args) {
		
		int n = 15;
		
		Fibonacci fi = new Fibonacci(); // Ŭ������ ȣ���� ���� �ƴ϶�, �����ڸ� ȣ���� ��?
		//int array[] = fi.process(15);
		
		fi.process(15);
		
		ArrayList<Integer> array = fi.process(15);
		
		for(int number : array){
			System.out.println(number);
		}

	}

}
