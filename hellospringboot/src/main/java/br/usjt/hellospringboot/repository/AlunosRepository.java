package br.usjt.hellospringboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import br.usjt.hellospringboot.model.Aluno;

public interface AlunosRepository extends JpaRepository<Aluno, Long>{

	List<Aluno> findAll();

	void save(Aluno aluno);

}
