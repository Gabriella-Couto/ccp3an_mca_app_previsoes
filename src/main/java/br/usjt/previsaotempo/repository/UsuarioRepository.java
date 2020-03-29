package br.usjt.app_previsoes.repository;

import br.usjt.app_previsoes.model.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	public Usuario findOneByLoginAndSenha (String login, String senha);
}