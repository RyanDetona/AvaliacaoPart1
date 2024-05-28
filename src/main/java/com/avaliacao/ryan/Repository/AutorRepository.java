package com.avaliacao.ryan.Repository;

import com.avaliacao.ryan.Entities.Autor;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface AutorRepository extends JpaRepository<Autor, Long> {
	
	@Query(value = "SELECT * FROM autor WHERE lower(1.nome) LIKE %:nome%", nativeQuery = true)
	List<Autor> buscarPorNome(@Param("nome") String nome);
	
	@Query(value = "SELECT * FROM autor WHERE lower(1.pais) LIKE %:pais%", nativeQuery = true)
	List<Autor> buscarPorPais(@Param("pais") String pais);

}
