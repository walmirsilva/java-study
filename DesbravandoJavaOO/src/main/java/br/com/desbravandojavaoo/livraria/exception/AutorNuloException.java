package br.com.desbravandojavaoo.livraria.exception;

public class AutorNuloException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public AutorNuloException(String message) {
		super(message);
	}
}
