package br.com.mrsistemas._02.introducao;

/**
 *
 * @author marcondes
 */
public class _10_Ternario {
    
    public static void main(String[] args) {
        
        String mensagem = "O número é: ";
        int numero = 15;
        int resto = numero % 2;
        mensagem += (resto == 0) ? "Par" : "Impar";
        System.out.println(mensagem);
    }
    
}
