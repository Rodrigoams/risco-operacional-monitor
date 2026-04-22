package com.example.monitorrisco.model;

import jakarta.persistence.*;
import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Entity
public class Transacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String clienteId;
    private BigDecimal valor;
    private LocalDateTime dataHora;
    private String status;
    private String motivoRisco;
}