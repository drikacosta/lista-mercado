package lista_mercado.repository;

import java.util.concurrent.CompletableFuture;

import org.springframework.stereotype.Repository;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import lista_mercado.model.Produto;

@Repository
public class ProdutoRepository {

    private final DatabaseReference databaseReference;

    public ProdutoRepository (){
        databaseReference = FirebaseDatabase.getInstance().getReference("produtos");
    }

    public CompletableFuture<Void> salvarProduto (Produto produto){
    return databaseReference.child(produto.getId()).setValueAsync(produto);
    }

    
    
}
