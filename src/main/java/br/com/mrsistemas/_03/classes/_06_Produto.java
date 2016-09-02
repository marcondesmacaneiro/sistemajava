package br.com.mrsistemas._03.classes;

/**
 *
 * @author marcondes
 */
public class _06_Produto {
    
    private String descricao;
    private String marca;
    private double preco;
    
    public void valoresIniciais(double umPreco, String umaMarca) {
        this.setPreco(preco);
        this.setMarca(marca);
    }
    
    public void valoresIniciais(double umPreco, String umaMarca, String umaDescricao) {
        this.valoresIniciais(umPreco, umaMarca);
        this.setDescricao(descricao);
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco > 0) {
            this.preco = preco;
        }
    }
    
    public void aumentaPreco(double porcentagem) {
        
    }
    
    public void imprime() {
        
    }
    
}
