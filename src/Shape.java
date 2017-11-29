//60171636 배수혜
abstract class Shape implements Drawable, Movable{ //Drawable을 구현하는 abstract 클래스 Shape을 생성한다.
	double area; //double type의 area라는 변수를 설정한다
	double Length; //double type의 Length라는 변수를 설정한다
	double f; //double type의 f라는 변수를 설정한다
	double g; //double type의 g라는 변수를 설정한다
	String name; //String type의 name라는 변수를 설정한다
	
	
	public void draw() {
		//Drawable 구현
	}
	
	public void move(double dx, double dy) {
		//move 구현
	}
	
	double getCoord1() {
		//x좌표
		return f;   
	}
	
	double getCoord2() {
		//y좌표
		return g;
	}
	
	double getArea() {
		//넓이 설정
		return area;
	}
	

	double getLength() {
		//길이 설정
		return Length;
	}
		
}
