package br.com.evertonsantos.transactionreport.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.evertonsantos.transactionreport.entity.Transacao;

public interface TransacaoRepository extends CrudRepository<Transacao, Long> {
    
}
