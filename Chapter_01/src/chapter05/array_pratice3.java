package chapter05;

import java.util.ArrayList;
import java.util.Scanner;

public class array_pratice3 {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		ArrayList<Integer> scores =new ArrayList<>();//integer 타입의 arrary리스트 생성한다.
		int data;
		int sum =0;
		
		while ((data = scanner.nextInt()) >=0) // 키보드에서 입력된값이 음수 가 아닐때 반복한다.
			scores.add(data);		 //데이터를 동적 배열에 추가한다.
		for (int  i =0; i< scores.size(); i++) {
			sum+= scores.get(i);  //동적 배열i 번째 원소를 가져온다.
		}
		System.out.println("평균 ="+(double)sum/ scores.size());
		
	
	}  //main	가
}
