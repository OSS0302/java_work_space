package chapter05;

import java.util.ArrayList;
import java.util.Scanner;

public class array_pratice4 {

	public static void main(String[] args) {
		int[] one2five= {1,2,3,4,5};
		int sum =0;
		for (int i =0; i <one2five.length; i++) {
			one2five[i]++;
		}
		for (int i :one2five) {
			sum +=i;
			
		}
		System.out.println("평균 "+sum / 5.0);
	
	}  //main	가
}
