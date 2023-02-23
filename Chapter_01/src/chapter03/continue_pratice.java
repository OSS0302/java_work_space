package chapter03;

public class continue_pratice {

	public static void main(String[] args) {
		for (int i =0; i<10; i++) {
			if (i%2==0)
				continue;  // 짝수 일때는 for 문의 증감식 i++)으로 이동한다. 
			System.out.println(i);   //홀수일 때만 출력한다. 
		}
	}

}
