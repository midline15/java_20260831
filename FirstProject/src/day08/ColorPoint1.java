package day08;

public class ColorPoint1 extends Point{
	
	String color;
	
	ColorPoint1(int x, int y, String color){
		super(x,y);
		this.color = color;		
	}

	public static void main(String[] args) {
		   ColorPoint1 cp = new ColorPoint1(5, 5, "YELLOW");
		   cp.setXY(10, 20);
		   cp.setColor("RED");
//		   String str = cp.toString();
		   System.out.println(cp+"입니다. ");
		}

	void setColor(String color) {
		this.color = color;
	}

	public void setXY(int x, int y) {
		move(x, y);
	}
	
	@Override
	public String toString() {
		return color + "색의 ("+getX()+","+getY()+")의 점";
	}
	
}
