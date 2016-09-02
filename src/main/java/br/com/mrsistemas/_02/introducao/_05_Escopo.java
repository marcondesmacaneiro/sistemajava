package br.com.mrsistemas._02.introducao;

/**
 *
 * @author marcondes
 */
public class _05_Escopo {
    
    public static void main(String[] args) {
        {
            int quantidade = 3;
            System.out.println("Valor: " + quantidade);
        }
        //TODO verificar
        //System.out.println("Valor: " + quantidade);
    }
}
