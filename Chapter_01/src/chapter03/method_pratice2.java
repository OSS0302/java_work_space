package chapter03;

public class method_pratice2 {
	
	public	static int sum(int i1, int i2) {  //사용자가 정의한 메서드다.
		int sum =0;
		for (int i =i1; i<=i2; i++)    // 메서드 본체로 이 부분을 재활용한다. 
			
		sum +=i;
		
		return sum;
		
	}
	public static void main(String[] args) {
		int i  = 1, j =10;
		int k  =sum (i,j);
		System.out.println(k);
	}
}
