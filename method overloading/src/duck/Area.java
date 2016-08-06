package duck;

public class Area {
	
	public static void main(String[] args) {
		
		int a = 5;
		int b = 8;
		
		
		System.out.println(area(a, b));
		System.out.println(area(a));
	}

	static int  area(int a, int b) {
		
		return a*b;
	}
	static int area(int a) {
		
		return a*a;
	}
	
}



