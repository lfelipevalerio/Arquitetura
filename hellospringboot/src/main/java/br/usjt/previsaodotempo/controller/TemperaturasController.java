package br.usjt.previsaodotempo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.usjt.hellospringboot.model.Aluno;
import br.usjt.hellospringboot.repository.AlunosRepository;

@Controller
public class TemperaturasController<TemperaturasRepository> {
	@Autowired
	private TemperaturasRepository temperaturasRepo;

	@GetMapping("/temperaturas")
	public ModelAndView listarTemperaturas() {
		// passe o nome da página ao construtor
		ModelAndView mv = new ModelAndView("lista_temperaturas");
		// Busque a coleção com o repositório
		List<Temperatura> temperaturas = temperaturasRepo.findAll();
		// adicione a coleção ao objeto ModelAndView
		mv.addObject("temperaturas", temperatura);
		// para modelar o formulário
		mv.addObject(new Temperatura());
		// devolva o ModelAndView
		return mv;
	}

	@PostMapping
	public String salvar(Temperatura temperatura) {
		temperaturasRepo.save(temperatura);
		return "redirect:/temperaturas";
	}

}
