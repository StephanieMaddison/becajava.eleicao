package br.eleicao.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Voto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long Id;
	private int Codigo;
	
	public int getCodigo() {
		return Codigo;
	}
	public void setCodigo(int codigo) {
		Codigo = codigo;
	}
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	
	@ManyToOne
	@JoinColumn(name="CandidatoId")
	private Candidato Candidato;
	
	@ManyToOne
	@JoinColumn(name="EleitorId")
	private Eleitor Eleitor;
	
	@ManyToOne
	@JoinColumn(name="ZonaId")
	private Zona Zona;

}
