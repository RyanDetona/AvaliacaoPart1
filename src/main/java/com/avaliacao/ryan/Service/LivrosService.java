package com.avaliacao.ryan.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.avaliacao.ryan.Entities.Livros;
import com.avaliacao.ryan.Repository.LivrosRepository;

@Service
public class LivrosService {
	
	@Autowired
	private LivrosRepository livrosRepository;
	
	public List<Livros> getAllLivros(){
		return livrosRepository.findAll();
	}
	
	public Livros getLivrosById(long idLivros) {
		return livrosRepository.findById(idLivros).orElse(null);
	}
	
	public Livros saveLivros(Livros livros) {
		return livrosRepository.save(livros);
	}
	
	public List<Livros> buscarPorTitulo(String titulo) {
		return livrosRepository.buscarPorTitulo(titulo);
	}
	
	public List<Livros> buscarPorAno(String ano) {
		return livrosRepository.buscarPorAno(ano);
	}

}
