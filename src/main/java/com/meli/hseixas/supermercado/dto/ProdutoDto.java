package com.meli.hseixas.supermercado.dto;

import lombok.Data;

@Data
public class ProdutoDto {
    private Long id;

    private String nome;

    private double valor;
}