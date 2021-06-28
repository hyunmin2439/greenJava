package animals;

public class Tail {
	private int length; // 길이
	private int thick; // 두께
	
	public Tail(int length, int thick) {
		super();
		this.length = length;
		this.thick = thick;
	}
	
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getThick() {
		return thick;
	}
	public void setThick(int thick) {
		this.thick = thick;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + length;
		result = prime * result + thick;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tail other = (Tail) obj;
		if (length != other.length)
			return false;
		if (thick != other.thick)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Tail [length=" + length + ", thick=" + thick + "]";
	}
	
	
}
