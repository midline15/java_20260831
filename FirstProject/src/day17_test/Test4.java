package day17_test;

public class Test4 {

	public static void main(String[] args) {
		
		String fileName = "my_project.version2.java";
		String extention="";
		for (int i = fileName.length()-1; i >= 0; i--) {
			if(fileName.charAt(i) == '.') {
				extention = fileName.substring(i+1);
				break;
			}
		}
		System.out.println(extention);
		
	}

}
