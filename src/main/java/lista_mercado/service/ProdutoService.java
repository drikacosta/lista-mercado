package lista_mercado.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lista_mercado.model.Produto;
import lista_mercado.repository.ProdutoRepository;

@Service
public class ProdutoService {
    
    @Autowired
    private ProdutoRepository produtoRepository;

    public void salvarProduto(Produto produto){
        produtoRepository.salvarProduto(produto);
    }

    public Iterable<Produto> listarProdutos(){
        return produtoRepository.listarProdutos().getKey();
    }
    
}
