//60171636 배수혜
public class Text implements Drawable {  //Drawable을 구현하는 class Text를 생성
	String a;
	
	public Text(String string) {
		// TODO Auto-generated constructor stub
		//Text의 constructor
		this.a = string;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		//draw()를 override
		System.out.println(a);
	}

}
