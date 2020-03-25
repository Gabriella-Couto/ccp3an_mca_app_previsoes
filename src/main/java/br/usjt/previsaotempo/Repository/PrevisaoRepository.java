package br.usjt.previsaotempo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.usjt.previsaotempo.Model.Previsao;

public interface PrevisaoRepository extends JpaRepository<Previsao,Long>{

}
