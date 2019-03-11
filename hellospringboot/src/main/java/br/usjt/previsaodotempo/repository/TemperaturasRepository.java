package br.usjt.previsaodotempo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.usjt.hellospringboot.model.Aluno;

public interface TemperaturasRepository extends JpaRepository<Temperatura, Long>{

}
