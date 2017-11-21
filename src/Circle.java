//60171636 배수혜
public class Circle extends Shape{  //Shape 클래스를 상속방는 Circle이라는 클래스를 생성한다
	double x; //double type인 변수 x를 설정한다
	double y; //double type인 변수 y를 설정한다
	double z; //double type인 변수 z를 설정한다
	String name = "Circle"; //String type인 변수 name을 설정하고, 그 값을 "Circle"로 초기화한다
	
	public Circle(double x, double y, double z) {
		//Circle의 constructor 생성
		this.x = x;  //이 클래스에서 x 는 이때 입력받은 x값이 된다.
		this.y = y;  //이 클래스에서 y 는 이때 입력받은 y값이 된다.
		this.z = z;  //이 클래스에서 z 는 이때 입력받은 z값이 된다.
	}
	
	public void draw() {
		//draw()를 override
		System.out.println(name + " center" + "(" + x + ", " + y + ")" + "-" + "radius" + "(" + z + ")");
	}
	
	double getCoord1() {
		//getCoord1()을 override
		//x좌표
		f = x;
		return f;
	}
	
	double getCoord2() {
		//getCoord2()를 override
		//y좌표
		g = y;
		return g;
	}
	
	double getArea() {
		//getArea()를 override
		//넓이 설정
		//반지름은 3.14로 계산함
		area = z*z*3.14;
		return area;
	}
	
	double getLength() {
		//getLength()를 override
		//길이 설정
		//반지름은 3.14로 계산함
		Length = z*2*3.14;
		return Length;
	}
	
}

