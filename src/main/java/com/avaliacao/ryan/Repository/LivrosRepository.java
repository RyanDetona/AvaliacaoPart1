package com.avaliacao.ryan.Repository;

import com.avaliacao.ryan.Entities.Livros;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface LivrosRepository extends JpaRepository<Livros, Long> {
	
	@Query(value = "SELECT * FROM livros WHERE lower(1.titulo) LIKE %:titulo%", nativeQuery = true)
	List<Livros> buscarPorTitulo(@Param("titulo") String titulo);
	
	@Query(value = "SELECT * FROM Livros WHERE lower(1.ano) LIKE %:ano%", nativeQuery = true)
	List<Livros> buscarPorAno(@Param("ano") String ano);

}
