package br.com.evertonsantos.transactionreport.service;

import org.springframework.stereotype.Service;

import br.com.evertonsantos.transactionreport.entity.Transacao;

import br.com.evertonsantos.transactionreport.repository.TransacaoRepository;

@Service
public class TransacaoService {
    private final TransacaoRepository repository;

    public TransacaoService(TransacaoRepository repository) {
        this.repository = repository;
    }

    public Iterable<Transacao> listTotaisTransacoesPorNomeDaLoja() {
        var transacoes = repository.findAll();
        return transacoes;

    }

}
