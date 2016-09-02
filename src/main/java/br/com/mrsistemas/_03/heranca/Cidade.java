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
public class Cidade {
    private String nome;
    private Estado estado;

    public Cidade(String nome, Estado estado) {
        this.nome = nome;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Cidade{" + "nome=" + nome + ", estado=" + estado + '}';
    }
    
    
}
