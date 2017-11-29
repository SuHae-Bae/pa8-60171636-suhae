//60171636 배수혜
public class Circle extends Shape{  //Shape 클래스를 상속방는 Circle이라는 클래스를 생성한다
	double x; //원의 중심의 x좌표
	double y; //원의 중심의 y좌표
	double z; //반지름의 길이 z
	String name = "Circle"; //String type인 변수 name을 설정하고, 그 값을 "Circle"로 초기화한다
	
	public Circle(double x, double y, double z) {
		//Circle의 constructor 생성
		this.x = x;  //이 클래스에서 x 는 이때 입력받은 x값이 된다.
		this.y = y;  //이 클래스에서 y 는 이때 입력받은 y값이 된다.
		this.z = z;  //이 클래스에서 z 는 이때 입력받은 z값이 된다.
	}
	
	public void draw() {
		//draw()를 override
		//(원 중심의 좌표)-(반지름의 길이)의 형식
		System.out.println(name + " center" + "(" + x + ", " + y + ")" + "-" + "radius" + "(" + z + ")");
	}
	
	public void move(double dx, double dy) {
		for(int i = 0; i < 10; i++) {
			dx = dx + 10;//원의 중심의 x좌표를 +10칸 옮긴다
			dy = dy + 10;//원의 중심의 y좌표를 +10칸 옮긴다
			this.x = dx;//x값은 x좌표를 +10칸 옮긴 값이 된다
			this.y = dy;//y값은 y좌표를 +10칸 옮긴 값이 된다
			draw();
		}
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

