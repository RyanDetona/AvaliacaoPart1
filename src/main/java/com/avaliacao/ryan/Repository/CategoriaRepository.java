package com.avaliacao.ryan.Repository;

import com.avaliacao.ryan.Entities.Categoria;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
	
	@Query(value = "SELECT * FROM categoria WHERE lower(1.nome) LIKE %:nome%", nativeQuery = true)
	List<Categoria> buscarPorNome(@Param("nome") String nome);
	
	@Query(value = "SELECT * FROM categoria WHERE lower(1.descricao) LIKE %:descricao%", nativeQuery = true)
	List<Categoria> buscarPorDescricao(@Param("descricao") String descricao);

}
