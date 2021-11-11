package br.com.demo.forum.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.demo.forum.model.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {

	Curso findByNome(String nomeCurso);
	
	
}
