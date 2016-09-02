/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mrsistemas._03.heranca;

/**
 *
 * @author marcondes
 */
public class Endereco {
    
    private String rua;
    private int numero;
    private Cidade cidade;
    
    public Endereco(String rua, int numero, Cidade cidade) {
        this.cidade = cidade;
        this.rua = rua;
        this.numero = numero;
    }
    
    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Endereco{" + "rua=" + rua + ", numero=" + numero + ", cidade=" + cidade + '}';
    }
 
}
