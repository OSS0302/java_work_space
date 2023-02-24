package chapter03;

public class method_pratice {
	
	public	static int sum(int i1, int i2) {  //사용자가 정의한 메서드다.
		int sum =0;
		for (int i =i1; i<=i2; i++)    // 메서드 본체로 이 부분을 재활용한다. 
			
		sum +=i;
		
		return sum;
		
	}
	
	public static void main(String[] args) {//main () 메서드다. 
		System.out.println("합(1~10):"+sum(1,10));
		System.out.println("합(10~100):"+sum(10,100));
		System.out.println("합(100~1000):"+sum(100,1000)); // 사용자가 정의 한 메서드를 호출한다. 
		
	}

}
