package chapter02;

import java.util.Scanner;

public class if_pratice3 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("숫자를 입력해주세용~!");
		int number = in.nextInt();				// 키보트로 입력받는다.
		
		if (number%2==0) {
			System.out.println("짝수 ");	//입력값이짝수 일때만 실행한다.
		}
		else
			System.out.println("홀수 "); //입력 값이 홀 수일때만 실행한다.
		System.out.println("종료 ");
		}
		
			
	}


