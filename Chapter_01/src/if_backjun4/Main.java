package if_backjun4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int row  = in.nextInt();
		for (int col =1; col<=9; col++) {
		System.out.printf(row+" * "+ col +" = "+ row*col +"\n");
		}
		
		
		in.close();
	}

}
		
	

	


