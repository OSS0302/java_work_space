package chapter02;

import java.util.Scanner;

public class another_if_pratice {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String grade;
		System.out.print("점수를 입력 해주세요 . ");
		int score = in.nextInt();
		if (score >= 90)
			grade = "A";
		else { 
			if (score>= 80)
			grade ="B";
		else {
			if (score >= 70)
			grade ="C";
		else {
			if (score>=60)
			grade ="D";
		else
			grade="F";
		
				}
			}
		}
		System.out.println("당신의 학점은 "+grade );
	}
}
