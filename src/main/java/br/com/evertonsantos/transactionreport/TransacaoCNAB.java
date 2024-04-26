package br.com.evertonsantos.transactionreport;

import java.math.BigDecimal;

public record TransacaoCNAB(

Integer tipo,
String data,
BigDecimal valor,
Long cpf,
String cartao,
String hora,
String donoloja,
String nomeDaLoja) {
    
}
