//60171636 배수혜
//괄호를 생활화하자!!!!!!!!!
public class Triangle extends Shape {
	double x; //꼭짓점의 x좌표
	double y; //꼭짓점의 y좌표
	double z; //삼각형의 밑변
	double p; //삼각형의 높이
	String name = "Triangle"; //String type인 변수 name을 설정하고, 이를 "Triangle"로 초기화시킨다
	
	public Triangle(double x, double y, double z, double p) {
		//Triangle의 constructor 생성
		this.x = x;
		this.y = y;
		this.z = z;
		this.p = p;
	}
	
	public void draw() {
		//(중앙의 꼭짓점)-(좌하단 꼭짓점)-(우상단 꼭짓점)의 형식
		System.out.println(name + " vertex1 " + "(" + x + ", " + y + ")" + "-" + " vertex2 " + "(" + (x-z/2) + ", "  + (y-p) + ")" + "-" + " vertex3 " + "(" + (x+z/2) + ", " + (y-p) + ")");
	}
	
	
	public void move(double dx, double dy) {
		
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
		area = z*p*1/2;
		return area;
	}
	
	double getLength() {
		//getLength()를 override
		//길이 설정
		Length = (Math.hypot(z/2, p))*2 + z;
		return Length;
	}
	
	
}
