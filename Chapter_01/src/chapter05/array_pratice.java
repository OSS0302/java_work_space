package chapter05;

import java.util.Scanner;

public class array_pratice {

	public static void main(String[] args) {
	Scanner scanner =new Scanner(System.in);
	int scores[] =new int [5]; // 배열을 선언하고 동시에 5개원소를 가진 배열 객체를 생성한다.
	int sum =0;
	for (int i =0; i <scores.length; i++) {
	
		scores[i] = scanner.nextInt();  //키보드에서 입력받은 정수를 배열에 대입한다.
	}
	for (int i =0; i<scores.length;i ++) { //scores.length  scores 배열의 크기를 나타낸다.
		
		sum +=scores[i];   //배열에 저장된정숫값을 모두 더한다. 
	}
System.out.println("평균 ="+sum /5.0);
		
	
	}  //main	가
}
