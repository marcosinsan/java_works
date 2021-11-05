package br.com.demo.forum.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.demo.forum.model.Topico;

public interface TopicoRepository extends JpaRepository<Topico, Long> {

}
