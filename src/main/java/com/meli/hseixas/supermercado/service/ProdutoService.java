package com.meli.hseixas.supermercado.service;

import com.meli.hseixas.supermercado.model.Produto;
import com.meli.hseixas.supermercado.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public List<Produto> listarTodosProdutos(){
        return produtoRepository.findAll();
    }

    public Produto listarProdutoPorId(Long id) {
        return produtoRepository.findById(id).orElse(null);
    }

    public Produto cadastrarProduto(Produto produto) {
        return produtoRepository.save(produto);
    }

    public Produto alterarProduto(Long id, Produto novoProduto) {
        Optional<Produto> produtoOptional = produtoRepository.findById(id);
        if (produtoOptional.isPresent()){
            Produto produto = produtoOptional.get();
            produto.setNome(novoProduto.getNome());
            produto.setValor(novoProduto.getValor());
            return produtoRepository.save(produto);
        }
        return null;
    }
    public Produto alterarProdutoParcial(Long id, Produto novoProduto) {
        Optional<Produto> produtoOptional = produtoRepository.findById(id);
        if (produtoOptional.isPresent()){
            Produto produto = produtoOptional.get();

            if (novoProduto.getNome() != null){
                produto.setNome(novoProduto.getNome());
            } else {
                produto.setNome(produtoOptional.get().getNome());
            }

            if (novoProduto.getValor() != 0){
                produto.setValor(novoProduto.getValor());
            } else {
                produto.setValor(produtoOptional.get().getValor());
            }
            return produtoRepository.save(produto);
        }
        return null;
    }

    public void excluirProduto(Long id) {
        produtoRepository.deleteById(id);
    }

}
