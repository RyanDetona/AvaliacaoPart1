
package com.avaliacao.ryan.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.avaliacao.ryan.Service.LivrosService;
import com.avaliacao.ryan.Entities.Livros;

@RestController
@RequestMapping("/livros")
public class LivrosController {
	
	private LivrosService livrosService;

	@Autowired
	public LivrosController(LivrosService livrosService) {
		this.livrosService = livrosService;
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Livros> findlivrosbyId(@PathVariable long id){
		Livros livros = livrosService.getLivrosById(id);
		if (livros != null) {
			return ResponseEntity.ok(livros);
		} else {
			return ResponseEntity.notFound().build();
		}
	}
	
	@GetMapping("/")
	public ResponseEntity<List<Livros>> findAllUsuarioscontrol() {
		List<Livros> livros = livrosService.getAllLivros();
		return ResponseEntity.ok(livros);
	}

	@PostMapping("/")
	public ResponseEntity<Livros> insertUsuariosControl(@RequestBody Livros livros) {
		Livros novolivros = livrosService.saveLivros(livros);
		return ResponseEntity.status(HttpStatus.CREATED).body(novolivros);
	}
	
	@GetMapping("/titulo/{titulo}")
	public List<Livros> buscarPorTitulo(@PathVariable String titulo){
		return livrosService.buscarPorTitulo(titulo);
	}
	
	@GetMapping("/ano/{ano}")
	public List<Livros> buscarPorAno(@PathVariable String ano){
		return livrosService.buscarPorAno(ano);
	}
	
}
