package chapter01;

public class ture_false {

	public static void main(String[] args) {
		int x =1;
		int y;
		y =(x==1 )? 10:20;  // x == 1 이 true 이므로y	에 10을대입한다.
		System.out.println(y);
		y = (x>1)? x++ :x+20;   // x>1 거짓으로 y에 x +20의값을 대입한다. 쇼트서킷 로직을 이용하므로 x++는 수행하지않는다ㅣ.
		
		System.out.println(x);
		System.out.println(y);
	}

}
