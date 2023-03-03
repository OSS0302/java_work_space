package backjun4;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		double num1 =scanner.nextInt();  //num1 에대한 입력함수
		double  num2 =scanner.nextInt(); //num2에 대한입력함수 
		System.out.println(num1*num2); // 나누기 
		scanner.close(); //스캔함수 를 닫아야한다.
	}

}
