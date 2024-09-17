package br.com.comtrole.financas.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.comtrole.financas.model.Transacao;
import br.com.comtrole.financas.model.TipoTransacao;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@RestController
@RequestMapping("/transacao")
public class TransacaoController {

    @GetMapping
    public Transacao obterTransacao() {
        Transacao transacao = new Transacao();
        transacao.setDescricao("Minha primeira transacao");
        transacao.setValor(new BigDecimal("100.00"));
        transacao.setHorario(LocalDateTime.now());
        transacao.setTipo(TipoTransacao.OUTROS);
        return transacao;
    }
}
