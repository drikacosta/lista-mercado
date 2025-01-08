package lista_mercado.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Produto {

    private String id;
    private String nome;
    private Double preco;
    private int quantidade;
    private String dataCompra;
}
