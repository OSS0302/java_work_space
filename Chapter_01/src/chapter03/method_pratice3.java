package chapter03;

public class method_pratice3 {
	
	public	static void  printScore(int score) {  //사용자가 정의한 메서드다.
		if (score<0 || score >100) {
			System.out.println("잘못된 점수 : "+score);
			return;
			
		}
		System.out.println("점수 : "+score);
		
	}
	public static void main(String[] args) {
		 printScore(99);
		 printScore(120);
	}
}
