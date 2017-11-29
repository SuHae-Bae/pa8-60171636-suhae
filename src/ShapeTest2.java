//60171636 배수혜

public class ShapeTest2 {
	public static void main(String[] args) {
		Shape[] shapes = new Shape[3];//shapes라는 이름을 가진 3 칸의 배열을 생성한다
		shapes[0] = new Rectangle(10, 20, 30, 40);
		shapes[1] = new Rectangle(30, 30, 10, 10);
		shapes[2] = new Circle(50, 20, 30);
	
		for(Shape s: shapes) { //shapes배열의 모든 원소에 대하여 다음을 순서대로 실행한다
			System.out.printf("Area: %.1f\n", s.getArea());
			System.out.printf("Length: %.1f\n", s.getLength());
		}
		
		Drawable[] drawables = new Drawable[5];//drawables라는 이름을 가진 5칸의 배열을 생성한다
		for(int i = 0; i<shapes.length; i++) {//i가 shapes배열의 길이(3)보다 작을 동안
			drawables[i] = (Drawable) shapes[i]; //drawables의 배열의 칸마다 shapes[i]가 들어간다
		}
		
		drawables[3] = new Text("Sample Text");//drawables의 3번 칸에는 Text("Sample Text")가 들어간다
		drawables[4] = new Bear(100, 100, 20);//drawables의 4번 칸에는 Bear(100, 100, 20)이 들어간다
		for(Drawable d: drawables) {
			d.draw(); //drawables 배열의 모든 원소에 대하여 다음을 순서대로 실행한다
		}
		
		//Circle의  move() 테스트
		System.out.println("Circle move() 테스트");
		Circle c = new Circle(100, 100, 20);
		c.move(100, 100);
		
		//Triangle의 draw(), getArea(), getLength() 테스트 
		System.out.println("Triangle 테스트");
		Triangle t = new Triangle(3, 4, 6, 4);
		t.draw();
		System.out.printf("Area: %.1f\n", t.getArea());
		System.out.printf("Length: %.1f\n", t.getLength());
		
		//Square의 draw(), getArea(), getLength() 테스트
		System.out.println("Square 테스트");
		Square q = new Square(4, 4, 4);
		q.draw();
		System.out.printf("Area: %.1f\n", q.getArea());
		System.out.printf("Length: %.1f\n", q.getLength());
	}
}
