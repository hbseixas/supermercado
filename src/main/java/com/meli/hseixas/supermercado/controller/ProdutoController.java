package com.meli.hseixas.supermercado.controller;

import com.meli.hseixas.supermercado.model.Produto;
import com.meli.hseixas.supermercado.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("produto")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping
    public List<Produto> listarTodosProdutos(){
        return produtoService.listarTodosProdutos();
    }

    @GetMapping("/{id}")
    public Produto listarProdutoPorId(@PathVariable Long id){
        return produtoService.listarProdutoPorId(id);
    }

    @PostMapping
    public Produto cadastrarProduto(@RequestBody Produto produto) {
        return produtoService.cadastrarProduto(produto);
    }

    @PutMapping("/{id}")
    public Produto alterarProduto(@PathVariable Long id, @RequestBody Produto produto) {
        return produtoService.alterarProduto(id, produto);
    }

    @PatchMapping("/{id}")
    public Produto alterarProdutoParcial(@PathVariable Long id, @RequestBody Produto produto) {
        return produtoService.alterarProdutoParcial(id, produto);
    }

    @DeleteMapping("/{id}")
    public void excluirProduto(@PathVariable Long id) {
        produtoService.excluirProduto(id);
    }


}
