package chapter05;

import java.util.ArrayList;
import java.util.Scanner;

public class array_pratice3 {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		ArrayList<Integer> scores =new ArrayList<>();//
		int data;
		int sum =0;
		
		while ((data = scanner.nextInt()) >=0) // 
			scores.add(data);		
		for (int  i =0; i< scores.size(); i++) {
			sum+= scores.get(i);
		}
		System.out.println("평균 ="+(double)sum/ scores.size());
		
	
	}  //main	가
}
