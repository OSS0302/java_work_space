package chapter05;

import java.util.Scanner;

public class array_pratice {

	public static void main(String[] args) {
	Scanner scanner =new Scanner(System.in);
	int scores[] =new int [5];
	int sum =0;
	for (int i =0; i <scores.length; i++) 
	{
		scores[i] = scanner.nextInt();
		
	for (int j =0; j<scores.length;j++) 
		{
		sum +=scores[i];
System.out.println("평균 ="+sum /5.0);
		}
	}
}  //main	가
}
