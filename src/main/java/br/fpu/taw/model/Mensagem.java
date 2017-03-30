package br.fpu.taw.model;

public class Mensagem {
	private long id;
	private String texto;
	private boolean teste;

	public Mensagem() {
	}

	public Mensagem(long id, String texto, boolean teste) {
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

	public boolean isTeste() {
		return teste;
	}

	public void setTeste(boolean teste) {
		this.teste = teste;
	}

	@Override
	public String toString() {
		return "Mensagem [id=" + id + ", texto=" + texto + ", teste=" + teste + "]";
	}

}
