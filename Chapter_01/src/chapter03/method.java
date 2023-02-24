package chapter03;

public class method {

	public static void main(String[] args) {
		int sum =0;
		for (int i =0; i<=10;   i++) 
		{
			sum +=i;	
		}
		System.out.printf("합(1~10):"+sum);
		sum = 0;
		for (int i =0; i<=100; i++) 
		{
			sum +=i;
		
		}
		System.out.println();
		System.out.printf("합(1~100):"+sum);
		sum =0;
		for (int i =0; i<1000; i++) 
		{
			sum +=i;
		}
		System.out.println();
		System.out.printf("합(1~100):"+sum);
	}
	
}
