package chapter05;

public class String_pratrice {

	public static void main(String[] args) {
		String s1 = "Hi, Java";   // 문자열 리터럴을 사용해 String타입의 s1 변수를 초기화한다.
		String s2 = "Hi, java";
		String s3 = new String("Hi,Java!");// 새로운 문자열을 객체를 생성해 String타입의s3 변수를 초기화 한다.
		String s4 = new String("Hi,Java!");
		
		System.out.println("s1 ==s2-> "+(s1==s2));
		System.out.println("s1 ==s3-> "+(s1==s3));
		System.out.println("s3 ==s4-> "+(s3==s4));
		
		s1 =s3;
		System.out.println("s1 ==s3-> "+(s1==s3));
	}

	

}
