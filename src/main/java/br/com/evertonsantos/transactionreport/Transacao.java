package br.com.evertonsantos.transactionreport;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Time;

public record Transacao(

        Long id,
        Integer tipo,
        Date data,
        BigDecimal valor,
        Long cpf,
        String cartao,
        Time hora,
        String donoloja,
        String nomeDaLoja) {

}