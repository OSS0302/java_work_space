package if_backjun1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		int num1 =scanner.nextInt();  //num1 에대한 입력함수
		int num2 =scanner.nextInt();  //num1 에대한 입력함수
		if (num1 <num2)
			System.out.println("<");
		else if (num1>num2)
			System.out.println(">");
		else
			System.out.println("==");
		scanner.close();
	}

}
