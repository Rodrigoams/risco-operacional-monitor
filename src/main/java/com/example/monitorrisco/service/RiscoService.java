package com.example.monitorrisco.service;

import com.example.monitorrisco.model.Transacao;
import com.example.monitorrisco.repository.TransacaoRepository;
import org.springframework.stereotype.Service;

@Service
public class RiscoService {
    private final TransacaoRepository repository;

    public RiscoService(TransacaoRepository repository) {
        this.repository = repository;
    }

    public Transacao analisar(Transacao t) {
        // Regra de Risco: Valores acima de 10k são suspeitos
        if (t.getValor().doubleValue() > 10000) {
            t.setStatus("SUSPEITA");
            t.setMotivoRisco("VALOR ACIMA DO LIMITE OPERACIONAL");
        } else {
            t.setStatus("APROVADA");
        }
        return repository.save(t);
    }
}