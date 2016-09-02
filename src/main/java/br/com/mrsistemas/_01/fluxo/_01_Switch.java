package br.com.mrsistemas._01.fluxo;

/**
 *
 * @author marcondes
 */
public class _01_Switch {
    
    public static void main(String[] args) {
        /**
         * Variáveis aceitas
         * char, byte, short, int, enum
         */
        switch ('3') {
            case '1' : 
                System.out.println("Um");
            case '2' :
                System.out.println("Dois");
            default:
                System.out.println("Default");
        }
    }
    
}
