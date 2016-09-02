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
public class Estado {
    private String nome;
    private Pais pais;

    public Estado(String nome, Pais pais) {
        this.nome = nome;
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Estado{" + "nome=" + nome + ", pais=" + pais + '}';
    }
    
}
