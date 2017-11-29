//60171636 배수혜

public class Square extends Shape{
	double x; //꼭짓점의 x좌표 
	double y; //꼭짓점의 y좌표
	double width; //한 변의 길이 width
	String name = "Square"; //String type인 변수 name을 설정하고, 이를 "Square"로 초기화시킨다

	public Square(double x, double y, double width) {
		// TODO Auto-generated constructor stub
		//Square의 constructor생성
		this.x = x;//이 클래스에서 x 는 이때 입력받은 x값이 된다.
		this.y = y;//이 클래스에서 y 는 이때 입력받은 y값이 된다.
		this.width = width;//이 클래스에서 width 는 이때 입력받은 width값이 된다.
	}
	
	public void draw() {  //draw()를 override
		//(좌하단 좌표(시작점))-(우상단 좌표)의 형식 
		System.out.println(name + " (" + x + ", " + y + ")" + "-" + "(" + (x+width) + ", " + (y+width) + ")" );
	}
	
	public void move(double dx, double dy) {
		
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
		area = width*width;
		return area;
	}
	
	double getLength() {  //getLength()를 override
		//길이 설정
		Length = width*4;
		return Length;
	}
}
