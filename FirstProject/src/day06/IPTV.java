package day06;

public class IPTV extends ColorTV{
	
	private String ip;

	public IPTV(String ip,int size,int color) {
		super(size,color);
		this.ip = ip;
	}
	
	@Override
	public void printProperty() {
//		System.out.println("나의 IPTV는 " + ip +" 주소의 " + getProperty());
		System.out.print("나의 IPTV는 " + ip + " 주소의 ");
		super.printProperty();
	}

}
