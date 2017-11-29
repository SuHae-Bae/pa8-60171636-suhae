//60171636 배수혜

import java.util.ArrayList;
import java.util.List;

public class Bear implements Drawable{//interface Drawable을 상속받는 Class Bear을 생성한다
	double x;//x좌표 
	double y;//y좌표
	double z;//반지름의 길이
	String name = "Bear"; //String type인 변수 name을 설정하고, 이를 "Bear"로 초기화시킨다
	public List<Shape> listA;

	
	public Bear(double x, double y, double z) {
		//Bear의 constructor 생성
		this.x = x;	//이 클래스에서 x 는 이때 입력받은 x값이 된다.
		this.y = y;	//이 클래스에서 y 는 이때 입력받은 y값이 된다.
		this.z = z;	//이 클래스에서 z 는 이때 입력받은 z값이 된다.
	}
	
	
	public void draw() {
		System.out.println(name);
		List<Shape> listA = new ArrayList<Shape>();//List listA 생성
		listA.add(new Rectangle(x-z, y-z, z*2, z*2));//리스트에 추가
		listA.add(new Circle(x-z, x-z, z/2));//리스트에 추가
		listA.add(new Circle(x+z, x+z, z/2));//리스트에 추가
		this.listA = listA;
		for(Shape a : listA) {//listA에 있는 모든 원소에 대해 다음을 실행
			a.draw();
		}
	
	}
}

