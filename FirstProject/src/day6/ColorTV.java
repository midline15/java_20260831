package day6;

public class ColorTV extends TV {

	private int color;

	public ColorTV(int size, int color) {
		super(size);
		this.color = color;
	}

	public void printProperty() {
		System.out.println(getProperty());
	}

	public String getProperty() {
		return getSize() + "인치 " + color + "컬러";
	}

}
