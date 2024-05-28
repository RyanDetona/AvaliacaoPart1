package com.avaliacao.ryan.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="livros")
public class Livros {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idLivros;
	
	@Column
	private String titulo;
	
	@Column
	private String ano;

	public Long getIdLivros() {
		return idLivros;
	}

	public void setIdLivros(Long idLivros) {
		this.idLivros = idLivros;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public Livros(Long idLivros, String titulo, String ano) {
		super();
		this.idLivros = idLivros;
		this.titulo = titulo;
		this.ano = ano;
	}
	
}
