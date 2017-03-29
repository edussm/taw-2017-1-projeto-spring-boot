package br.fpu.taw.controller.model;

public class Mensagem {
	private long id;
	private String texto;
	
	public Mensagem() {
		super();
	}

	public Mensagem(long id, String texto) {
		super();
		this.id = id;
		this.texto = texto;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	@Override
	public String toString() {
		return "Mensagem [id=" + id + ", texto=" + texto + "]";
	}

	
}
