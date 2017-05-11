
public class a {

	public static void main(String[] args) {

		int a = 1;
		int b = 2;
		
		System.out.println(a==b); //f
		System.out.println(a>b); //f
		System.out.println(!(a>b)); //t
		System.out.println(b==2); //t
		System.out.println(!(a!=b)); //f
		System.out.println();
		
		System.out.println(true == false);  //f
		System.out.println(true == (1>0)); // t
		System.out.println(false == (1>0)); //f
		System.out.println(!!!!true); //t

	}

}
