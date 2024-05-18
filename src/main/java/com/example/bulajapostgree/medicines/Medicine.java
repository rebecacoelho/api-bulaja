package com.example.bulajapostgree.medicines;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Medicine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String nomeGenerico;
    private String formaDeDosagem;
    private List<String> remediosRelacionados;
    private String descricao;
    private String efeitosColaterais;
    private String perigos;
    private String precaucoes;
}
