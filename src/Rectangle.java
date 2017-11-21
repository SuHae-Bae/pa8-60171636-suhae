//60171636 배수혜
public class Rectangle extends Shape{ //Shape 클래스를 상속받는 Rectangle이라는 클래스를 생성한다
	
	double x; //double type인 변수 x를 설정한다
	double y; //double type인 변수 y를 설정한다
	double z; //double type인 변수 z를 설정한다
	double p; //double type인 변수 p를 설정한다
	String name = "Rectangle"; //String type인 변수 name을 설정하고, 이를 "Rectangle"로 초기화시킨다

	public Rectangle(double x, double y, double z, double p) {
		// TODO Auto-generated constructor stub
		//Rectangle의 construntor생성
		this.x = x;//이 클래스에서 x 는 이때 입력받은 x값이 된다.
		this.y = y;//이 클래스에서 y 는 이때 입력받은 y값이 된다.
		this.z = z;//이 클래스에서 z 는 이때 입력받은 z값이 된다.
		this.p = p;//이 클래스에서 p 는 이때 입력받은 p값이 된다.
	}
	
	public void draw() {  //draw()를 override
		System.out.println(name + " (" + x + ", " + y + ")" + "-" + "(" + (x+z) + ", " + (y+p) + ")" );
	}
	
	double getCoord1() { //getCoord1()을 override
		//x좌표
		f = x;
		return f;
	}
	
	double getCoord2() {  //getCood2()를 override
		//y좌표
		g = y;
		return g;
	}
	

	double getArea() {  //getArea()를 override
		//넓이 설정
		area = z*p;
		return area;
	}
	
	double getLength() {  //getLength()를 override
		//길이 설정
		Length = (z+p)*2;
		return Length;
	}
	
}

