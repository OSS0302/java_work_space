package chapter05;

public class String_pratrice2 {

	public static void main(String[] args) {
		String s1  = new String("Hi");
		String s2 = new String("java");
		
		System.out.println("문자열길이 "+s1.length()); 
		System.out.println(s1.charAt(1));  // s1번 덱스 즉 두번째 문자를 반환한다.
		
		s1 = s1.concat((s2));
		System.out.println(s1.concat(s2)+"!");
		System.out.println(s1.toLowerCase()+"!");
		
		
		String s3 = "  ";
		System.out.println(s3.isEmpty()); // isEmpty()
		System.out.println(s3.isBlank());
		
		String s4="  ";
		System.out.println(s4.isEmpty());
		System.out.println(s4.isBlank());
		
		String s5 ="*-*";
		System.out.println(s5.repeat(10));
		
		System.out.println(s2.trim().indexOf("v"));
		
	}
	
}
