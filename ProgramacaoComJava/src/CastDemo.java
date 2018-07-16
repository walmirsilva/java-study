
class CastDemo {
	public static void main(String[] args) {
		double x, y;
		byte b;
		int i;
		char ch;
		
		x = 10.0;
		y = 3.0;
		
		// Efetua casting normalmente e não há perda de informação
		i = (int) (x / y);
		System.out.println("Integer outcome of x / y: " + i); // 3
		
		i = 100;
		// Efetua casting normalemente
		b = (byte) i;
		System.out.println("Value of b: " + b); // 100
		
		i = 257;
		// Há perda de informação nesse casting
		b = (byte) i;
		System.out.println("Value of b: " + b); // 1
		
		b = 88; // Código ASCII para X
		ch = (char) b;
		System.out.println("ch: " + ch); // X
	}
	
}