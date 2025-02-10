package lista_mercado.repository;

import lista_mercado.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutRepository extends JpaRepository<Produto, Long> {

}
