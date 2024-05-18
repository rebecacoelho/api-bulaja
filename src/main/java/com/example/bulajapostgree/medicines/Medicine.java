package com.example.bulajapostgree.medicines;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Medicine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100)
    private String nome;

    @Column(length = 100)
    private String nomeGenerico;

    @Column(columnDefinition = "TEXT")
    private String formaDeDosagem;

    @ElementCollection
    private List<String> remediosRelacionados;

    @Column(columnDefinition = "TEXT")
    private String descricao;

    @Column(columnDefinition = "TEXT")
    private String efeitosColaterais;

    @Column(columnDefinition = "TEXT")
    private String tratamento;

    @Column(columnDefinition = "TEXT")
    private String precaucoes;
}
