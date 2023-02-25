package chapter04;

public class class_pratice {

	public static void main(String[] args) {
		phone myPhone  =new phone(); //  변수선언과 객체 생성 
		myPhone.model = "아이폰14프로 "; // 객체의 필드에 값을 대입한다.
		myPhone.value =170;
		myPhone.print();  // 객체의 메서드를 호출한다.
		
		phone yourPhone = new phone();
		yourPhone.model ="아이폰14 프로맥스 ";
		yourPhone.value =190;
		yourPhone.print();  //객체의 메서드를 호출한다.
		
	}

}
