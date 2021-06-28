package testAbstract;

// Shape를 상속받았으니 추상 메서드로 정의된 메소드를 정의해야한다.
// body를 작성해야 한다.
public class Rectangle extends Shape {
	private int height;
	private int length;
	
	public Rectangle(int height, int length) {
		this.height = height; // this는 이 객체가 가지고 있는 속성값
		this.length = length;
	}
	
	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	@Override
	public String toString() {
		return "Rectangle [height=" + height + ", length=" + length + "]";
	}
	
	@Override
	public int getArea() {
		return height * length;
	}
}
