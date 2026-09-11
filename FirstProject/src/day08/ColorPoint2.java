package day08;

public class ColorPoint2 extends Point {

	String color = "BLACK";

	public ColorPoint2() {
		this(0, 0);
	}

	public ColorPoint2(int x, int y) {
		super(x, y);
	}

	public static void main(String[] args) {
		ColorPoint2 zeroPoint = new ColorPoint2(); // (0,0) 위치의 BLACK 색 점
		System.out.println(zeroPoint.toString() + "입니다.");
		ColorPoint2 cp = new ColorPoint2(10, 10); // (10,10) 위치의 BLACK 색 점
		cp.setXY(5, 5);
		cp.setColor("RED");
		System.out.println(cp.toString() + "입니다.");
	}

	private void setColor(String color) {
		this.color = color;
	}

	private void setXY(int x, int y) {
		move(x, y);
	}

	@Override
	public String toString() {
		return color +"색의 ("+getX()+","+getY()+") 점";
	}

}
