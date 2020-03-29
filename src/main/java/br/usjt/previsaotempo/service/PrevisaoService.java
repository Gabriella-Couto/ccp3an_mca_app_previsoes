package br.usjt.app_previsoes.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.usjt.app_previsoes.repository.*;
import br.usjt.app_previsoes.model.Previsao;

@Service
public class PrevisaoService {
	@Autowired
	private PrevisoesRepository previsoesRepo;
	
	public void salvar(Previsao previsao) {
		previsoesRepo.save(previsao);
	}
	
	public List<Previsao> listarTodos(){
		List<Previsao> previsoes = previsoesRepo.findAll();
		
		return previsoes;
	}

}



