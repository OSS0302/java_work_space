package if_backjun1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
			int grade = in.nextInt();
			
if(90<=grade && grade<=100) {
	 System.out.println("A");
}else  if (grade >= 80) {
	 System.out.println("B");
}else if (grade >= 70) {
	System.out.println("C");
}else if(grade >= 60) {
	System.out.println("D");
} else {
	System.out.println("F");
		in.close();
}

	 }
	
}	
	


