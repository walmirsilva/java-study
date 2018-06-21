package br.com.desbravandojavaoo.livraria;

import java.util.HashMap;
import java.util.Map;

public class GerenciadorDeCupons {
	
	private Map<String, Double> cupons;
	
	public GerenciadorDeCupons() {
		this.cupons = new HashMap<>(); 
		this.cupons.put("CUP11",10.0);
		this.cupons.put("CUP12",20.0);
		this.cupons.put("CUP13",30.0);
		this.cupons.put("CUP14",40.0);
	}

	public Double validaCupom(String cupom) {
		return this.cupons.get(cupom);
	}

}
