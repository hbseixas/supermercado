package com.meli.hseixas.supermercado.repository;

import com.meli.hseixas.supermercado.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
