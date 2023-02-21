package chapter01;

public class char_pratice {

	public static void main(String[] args) {
		char  c1 = 'A';				//문
		char c2 = 65;				//일종의 정수 타입이기 떄문에 65 대입가
		char c3 = '\u0041';		// 유니코드 값으로 대
		//char c4 = "A";				// "A"는 문자가 아니라 문자열 이므로 오류
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		char  ga1 ='가';
		char ga2 ='\uac00';
		
		boolean  cham = true;
		boolean geojit = false;
		System.out.println(ga1);
		System.out.println((int)ga1);
		System.out.println(ga2);
		System.out.println(++ga2);
		System.out.println(cham+"가 아니면 "+geojit+"입니다. ");
		
		
		
	}
	

}
