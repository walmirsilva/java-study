package br.com.desbravandojavaoo.livraria.testes;


public class CalculadoraDeEstoque {

	public static void main(String[] args) {
		double soma = 0;
		
		for (int i = 0; i < 35; i++) {
			double valorLivro = 59.90;
			soma += valorLivro;
		}
		
		
		System.out.println("O total em estoque � " + soma);
		
		if (soma < 150)
			System.out.println("Seu estoque est� muito baixo!");
		else if (soma >= 2000)
			System.out.println("Seu estoque est� muito alto!");
		else 
			System.out.println("Seu estoque est� bom");
	}

}
