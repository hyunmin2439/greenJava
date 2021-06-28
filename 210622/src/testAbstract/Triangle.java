package testAbstract;

public class Triangle extends Shape {
	private int height;
	private int base;
	
	public Triangle(int height, int base) {
		super();
		this.height = height;
		this.base = base;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}
	
	@Override
	public String toString() {
		return "Triangle [height=" + height + ", base=" + base + "]";
	}

	@Override
	public int getArea() {
		return height * base / 2;
	}

}
