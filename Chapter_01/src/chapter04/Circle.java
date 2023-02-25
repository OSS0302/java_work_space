package chapter04;

public class Circle {
	
	double radius;    //초기화 하지 않으므로 기본값이 0.0이여야한다. 
	
	double findArea() {
		return 3.14 * radius * radius;  //클래스의 멤버에 접근한다. radius 대신에  this.radius 를사용해도 된다. 원주율 3,14 *반지름 *반지름;
		
	}
	void show(double x , double y) {
		System.out.printf("반지름 = %.1f, 넓이 =%1f\n" ,x ,y);
	
	}
	

}
