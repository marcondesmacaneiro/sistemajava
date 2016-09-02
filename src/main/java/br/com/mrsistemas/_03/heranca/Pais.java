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
public class Pais {
    
    private String nome;

    public Pais(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Pais{" + "nome=" + nome + '}';
    }
    
}
