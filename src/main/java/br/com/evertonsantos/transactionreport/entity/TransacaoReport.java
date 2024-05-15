package br.com.evertonsantos.transactionreport.entity;

import java.math.BigDecimal;
import java.util.List;

public record TransacaoReport(
    String nomeDaLoja,
    BigDecimal total,
    List<Transacao> transacoes) {
    
}
