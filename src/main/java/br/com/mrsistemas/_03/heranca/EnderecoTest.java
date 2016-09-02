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
public class EnderecoTest {
    
    public static void main(String[] args) {
        Endereco e = new Endereco("Rua alguma coisa", 11, new Cidade("Rio do Sul", new Estado("Santa Catarina", new Pais("Brasil"))));
        System.out.println("Endereço: " + e);
    }
    
}
