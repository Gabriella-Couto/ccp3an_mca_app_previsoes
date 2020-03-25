package br.usjt.previsaotempo.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.usjt.previsaotempo.Model.Previsao;
import br.usjt.previsaotempo.Repository.PrevisaoRepository;

@Controller
public class PrevisaoController {
	@Autowired
	private PrevisaoRepository previsaoRepo;
	
	@RequestMapping("/")
	public String index() {
		return "redirect:/previsao";
	}

	@GetMapping("/previsao")
	public ModelAndView listarAlunos() {
		ModelAndView mv = new ModelAndView("lista_previsoes");
		List<Previsao> previsoes = previsaoRepo.findAll();
		mv.addObject("previsoes", previsoes);
		mv.addObject(new Previsao());
		
		return mv;
	}
	
	@PostMapping("/previsao")
	public String salvar(Previsao previsao) {
		previsaoRepo.save(previsao);
		return "redirect:/previsao";
	}

}
