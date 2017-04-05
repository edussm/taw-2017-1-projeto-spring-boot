package br.fpu.taw.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Escoteiro implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private String registro;

	@Column(nullable = false, length = 30)
	private String nome;

	@Column(nullable = false, length = 100)
	private String sobrenome;

	@ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
	@JoinColumn(name = "patrulha_id", nullable = false, updatable = true)
	private Patrulha patrulha;

	@OneToMany(mappedBy = "id.escoteiro", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<ParticipacaoEscoteiro> participacaoEscoteiro;

	public String getRegistro() {
		return registro;
	}

	public void setRegistro(String registro) {
		this.registro = registro;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public Patrulha getPatrulha() {
		return patrulha;
	}

	public void setPatrulha(Patrulha patrulha) {
		this.patrulha = patrulha;
	}

	public Set<ParticipacaoEscoteiro> getParticipacaoEscoteiro() {
		return participacaoEscoteiro;
	}

	public void setParticipacaoEscoteiro(Set<ParticipacaoEscoteiro> participacaoEscoteiro) {
		this.participacaoEscoteiro = participacaoEscoteiro;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Escoteiro [registro=");
		builder.append(registro);
		builder.append(", nome=");
		builder.append(nome);
		builder.append(", sobrenome=");
		builder.append(sobrenome);
		builder.append(", patrulha=");
		builder.append(patrulha);
		builder.append(", participacaoEscoteiro=");
		builder.append(participacaoEscoteiro);
		builder.append("]");
		return builder.toString();
	}

}
