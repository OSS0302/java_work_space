package chapter03;

public class break_pratice {

	public static void main(String[] args) {
		int  i = 1 , j=5;
		while (true) { // 무한 반복한다.
			System.out.println(i++);
			if (i>=j);   // 조건을 만족하면 즉 i>= j 이면 무한반복하는 while구문 벗어난다.
				break;
		}
	
	}

}
