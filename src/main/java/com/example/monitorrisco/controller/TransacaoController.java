package com.example.monitorrisco.controller;

import com.example.monitorrisco.model.Transacao;
import com.example.monitorrisco.service.RiscoService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/transacoes")
public class TransacaoController {

    private final RiscoService riscoService;

    public TransacaoController(RiscoService riscoService) {
        this.riscoService = riscoService;
    }

    @PostMapping
    public Transacao criar(@RequestBody Transacao transacao) {
        // Envia a transação recebida para a sua lógica de risco
        return riscoService.analisar(transacao);
    }
}