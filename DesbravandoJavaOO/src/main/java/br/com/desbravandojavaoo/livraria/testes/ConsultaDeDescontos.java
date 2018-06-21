package br.com.desbravandojavaoo.livraria.testes;

import br.com.desbravandojavaoo.livraria.GerenciadorDeCupons;

public class ConsultaDeDescontos {

	public static void main(String[] args) {
		GerenciadorDeCupons gerenciador = new GerenciadorDeCupons();
		Double desconto = gerenciador.validaCupom("CUP11");
		
		if (desconto != null) {
			System.out.println("Cupom de desconto válido");
			System.out.println("Valor: " + desconto);
		} else
			System.err.println("Esse cupom não existe!");
	}

}
