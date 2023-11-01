package com.meli.hseixas.supermercado.controller;

import com.meli.hseixas.supermercado.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("produto")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;


}
