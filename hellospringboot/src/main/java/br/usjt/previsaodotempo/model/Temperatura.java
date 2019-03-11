package br.usjt.previsaodotempo.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Temperatura implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Long id;
	private String diasemana;
	private Double tempminima;
	private Double tempmaxima;
	private Double humidade;
	private String descricao;

}
