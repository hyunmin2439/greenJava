package testAbstract;

public class Circle extends Shape {
	private double diameter;
	
	public Circle(double diameter) {
		super();
		this.diameter = diameter;
	}

	public double getDiameter() {
		return diameter;
	}

	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}

	@Override
	public String toString() {
		return "Circle [diameter=" + diameter + "]";
	}

	@Override
	public int getArea() {
		return (int)( Math.pow(diameter, 2) * Math.PI );
	}
}
