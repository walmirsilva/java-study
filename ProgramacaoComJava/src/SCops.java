
class SCops {
	public static void main(String[] args) {
		int n, d, q;
		
		n = 10;
		d = 2;
		
		if (d != 0 && (n % d) == 0)
			System.out.println(d + " is a factor of " + n);
		
		d = 0;
		// Utilizando o operador de curto-circuito && você evita o problema de divisão por zero
		if (d != 0 && (n % d) == 0)
			System.out.println(d + " is a factor of " + n);
		
		
		// Sem o operador de curto-circuito casará um erro
		// Exception: java.lang.ArithmeticException
		if (d != 0 & (n % d) == 0)
			System.out.println(d + " is a factor of " + n);
		
	}
	
}