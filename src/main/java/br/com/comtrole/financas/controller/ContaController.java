package br.com.comtrole.financas.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.comtrole.financas.model.Conta;
import br.com.comtrole.financas.model.TipoTransacao;
import br.com.comtrole.financas.model.Transacao;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;

@RestController
@RequestMapping("/conta")
public class ContaController {

    @GetMapping
    public Conta obterConta() {
        Conta conta = new Conta();
        conta.setSaldo(new BigDecimal("1000.00"));

        Transacao transacao1 = new Transacao();
        transacao1.setDescricao("Depósito Inicial");
        transacao1.setValor(new BigDecimal("500.00"));
        transacao1.setHorario(LocalDateTime.now());
        transacao1.setTipo(TipoTransacao.OUTROS);

        Transacao transacao2 = new Transacao();
        transacao2.setDescricao("Compra");
        transacao2.setValor(new BigDecimal("-150.00"));
        transacao2.setHorario(LocalDateTime.now());
        transacao2.setTipo(TipoTransacao.OUTROS);

        ArrayList<Transacao> transacoes = new ArrayList<>();
        transacoes.add(transacao1);
        transacoes.add(transacao2);

        conta.setTransacoes(transacoes);

        return conta;
    }
}
