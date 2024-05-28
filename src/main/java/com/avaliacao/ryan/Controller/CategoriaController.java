package com.avaliacao.ryan.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.avaliacao.ryan.Service.CategoriaService;
import com.avaliacao.ryan.Entities.Categoria;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {
	
	private CategoriaService categoriaService;

	@Autowired
	public CategoriaController(CategoriaService categoriaService){
		this.categoriaService = categoriaService;
	}
	
	@GetMapping("/{idCategoria}")
	public ResponseEntity<Categoria> findcategoriabyId(@PathVariable long idCategoria){
		Categoria categoria = categoriaService.getCategoriaById(idCategoria);
		if (categoria != null) {
			return ResponseEntity.ok(categoria);
		} else {
			return ResponseEntity.notFound().build();
		}
	}
	
	@GetMapping("/nome/{nome}")
	public List<Categoria> buscarPorNome(@PathVariable String nome){
		return categoriaService.buscarPorNome(nome);
	}
	
	@GetMapping("/descricao/{descricao}")
	public List<Categoria> buscarPorDescricao(@PathVariable String descricao){
		return categoriaService.buscarPorDescricao(descricao);
	}
}
