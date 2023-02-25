package chapter04;

public class class_pratice3 {

	public static void main(String[] args) {
		Circle myCircle = new Circle(); // 생성자를 호출해 Circle 객체를 생성한다.
		myCircle.radius =10.0;
		//myCircle 객체의 radius필드를 의미한다.
		myCircle.show(myCircle.radius ,myCircle.findArea());// myCircle 객체의 show()의 findArea() 메서드를 의미한다.
		
	}

}
