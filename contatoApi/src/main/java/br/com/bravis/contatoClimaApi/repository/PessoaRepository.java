package br.com.bravis.contatoClimaApi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.bravis.contatoClimaApi.model.Pessoa;

@Repository
public interface PessoaRepository extends CrudRepository<Pessoa, Long> {

	boolean existsByNome(String nome);
}
