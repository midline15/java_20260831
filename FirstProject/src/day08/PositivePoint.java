package day08;

public class PositivePoint extends Point{

	public PositivePoint(int x, int y) {
		super(x,y);
		if(x<0 || y<0) {
			super.move(0, 0);
		}
	}

	public PositivePoint() {
		this(0,0);
	}

	public static void main(String[] args) {
		   PositivePoint p = new PositivePoint();
		   p.move(10, 10);
		   System.out.println(p.toString()+"입니다.");
		   p.move(-5,5); // 객체 p는 음수 공간으로 이동되지 않음
		   System.out.println(p.toString()+"입니다.");
		   PositivePoint p2 = new PositivePoint(-10, -10);
		   System.out.println(p2.toString()+"입니다.");
		}
	
	@Override
	public String toString() {
		return "("+getX()+","+getY()+") 의 점";
	}
	
	@Override
	protected void move(int x, int y) {
		if(x<0 || y <0) {
			return;
		}
		super.move(x, y);
	}
}
