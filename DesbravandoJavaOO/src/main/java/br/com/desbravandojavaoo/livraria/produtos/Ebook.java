package br.com.desbravandojavaoo.livraria.produtos;

import br.com.desbravandojavaoo.livraria.Autor;

public class Ebook extends Livro implements Promocional {

	private String waterMark;
	
	public Ebook(Autor autor) {
		super(autor);
	}
	
	public void setWaterMark(String waterMark) {
		this.waterMark = waterMark;
	}
	
	public String getWaterMark() {
		return this.waterMark;
	}
	
	@Override
	public boolean aplicaDescontoDe(double porcentagem) {
		if (porcentagem > 0.15)
			return false;
		
		System.out.println("aplicando desconto no ebook");
		
		double desconto = getValor() * porcentagem;
		setValor(getValor() - desconto);
		
		return true;
	}
	
}
