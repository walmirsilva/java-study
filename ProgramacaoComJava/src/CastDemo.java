
class CastDemo {
	public static void main(String[] args) {
		double x, y;
		byte b;
		int i;
		char ch;
		
		x = 10.0;
		y = 3.0;
		
		// Efetua casting normalmente e n�o h� perda de informa��o
		i = (int) (x / y);
		System.out.println("Integer outcome of x / y: " + i); // 3
		
		i = 100;
		// Efetua casting normalemente
		b = (byte) i;
		System.out.println("Value of b: " + b); // 100
		
		i = 257;
		// H� perda de informa��o nesse casting
		b = (byte) i;
		System.out.println("Value of b: " + b); // 1
		
		b = 88; // C�digo ASCII para X
		ch = (char) b;
		System.out.println("ch: " + ch); // X
	}
	
}