
public class Count {

	public static void main(String[] args) {
	
		int pay = 10000;
		int buy = 3750;
		
		int num;
		
		//ÀÜµ·ÀÇ °³¼ö Ãâ·Â
		
		int change = pay - buy;
		
		quo(change);
		
		//Count co = new Count();
		//co.quo(change);
		
	}
	
	//static
	public static int quo(int change){
		
		int quo = 0;
		
		if((change / 5000) != 0 ){
			quo = change / 5000;
		}else if((change / 1000) != 0){
			quo = change / 1000;
		}else if((change / 500) != 0){
			quo = change / 500;
		}else if((change / 100) != 0){
			quo = change / 100;
		}
		
		System.out.println(quo);
		
		return quo;
	}
	
	public int rem(int change){
		
		int rem = change % 5000;
		
		return rem;
	}

}
