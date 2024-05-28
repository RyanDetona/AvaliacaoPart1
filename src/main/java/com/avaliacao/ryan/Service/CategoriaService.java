package com.avaliacao.ryan.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.avaliacao.ryan.Entities.Categoria;
import com.avaliacao.ryan.Repository.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public List<Categoria> getAllCategoria(){
		return categoriaRepository.findAll();
	}
	
	public Categoria getCategoriaById(long idCategoria) {
		return categoriaRepository.findById(idCategoria).orElse(null);
	}
	
	public List<Categoria> buscarPorNome(String nome) {
		return categoriaRepository.buscarPorNome(nome);
	}
	
	public List<Categoria> buscarPorDescricao(String descricao) {
		return categoriaRepository.buscarPorDescricao(descricao);
	}
}