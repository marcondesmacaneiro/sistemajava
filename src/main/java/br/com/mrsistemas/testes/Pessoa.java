package br.com.mrsistemas.testes;

/**
 *
 * @author marcondes
 */
public class Pessoa {
    
    {
        System.out.println("Inicializando");
    }
    
    private String nome;

    public Pessoa(String nome) {
        System.err.println("Criando o objeto");
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    protected void finalize() throws Throwable {
        System.err.println("Finalizando o Objeto");
    }
}
