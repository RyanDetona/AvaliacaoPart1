package com.avaliacao.ryan.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import com.avaliacao.ryan.Entities.Autor;
import com.avaliacao.ryan.Repository.AutorRepository;

@Service
public class AutorService {
	
	@Autowired
	private AutorRepository autorRepository;
	
	public List<Autor> getAllAutor(){
		return autorRepository.findAll();
	}
	
	public Autor getAutorById(long idAutor) {
		return autorRepository.findById(idAutor).orElse(null);
	}
	
	public Autor saveAutor(Autor autor) {
		return autorRepository.save(autor);
	}
	
	public List<Autor> buscarPorNome(String nome) {
		return autorRepository.buscarPorNome(nome);
	}
	
	public List<Autor> buscarPorPais(String pais) {
		return autorRepository.buscarPorPais(pais);
	}
}
