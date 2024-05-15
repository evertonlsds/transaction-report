package br.com.evertonsantos.transactionreport.web;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.evertonsantos.transactionreport.entity.Transacao;
import br.com.evertonsantos.transactionreport.entity.TransacaoReport;
import br.com.evertonsantos.transactionreport.service.TransacaoService;

@RestController
@RequestMapping("transacoes")
public class TransacaoController {
    private final TransacaoService service;

    

    public TransacaoController(TransacaoService service) {
        this.service = service;
    }



    @GetMapping
    Iterable<Transacao> listAll(){
        return service.listTotaisTransacoesPorNomeDaLoja();
    }
    
}
