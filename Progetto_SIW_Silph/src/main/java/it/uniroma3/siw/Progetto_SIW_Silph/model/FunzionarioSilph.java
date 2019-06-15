package it.uniroma3.siw.Progetto_SIW_Silph.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

import it.uniroma3.siw.Progetto_SIW_Silph.Galleria;

@Entity
public class FunzionarioSilph {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@Column
	private String nome;
	@Column
	private String username;
	@Column
	private String password;
	@Transient
	private Galleria galleria;
	
	public FunzionarioSilph() {}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Galleria getGalleria() {
		return galleria;
	}
	public void setGalleria(Galleria galleria) {
		this.galleria = galleria;
	}
	
	
	
}

