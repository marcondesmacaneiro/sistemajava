package br.com.mrsistemas._03.classes;

/**
 *
 * @author marcondes
 */
public class _07_Construtores {
    
    private String nome;
    private String descricao;
    private String codigo;
    private int cargaHoraria;

    //TODO explicar o uso do this
    public _07_Construtores(String nome, String descricao, String codigo, int cargaHoraria) {
        this.nome = nome;
        this.descricao = descricao;
        this.codigo = codigo;
        this.cargaHoraria = cargaHoraria;
    }

    public _07_Construtores(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    
    
    
}
