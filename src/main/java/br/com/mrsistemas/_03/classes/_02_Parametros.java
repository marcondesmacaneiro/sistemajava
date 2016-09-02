package br.com.mrsistemas._03.classes;

/**
 *
 * @author marcondes
 */
public class _02_Parametros {
    
    int soma(int x, int y) {
        return x + y;
    }
    
    double multiplicacao(double d1, double d2) {
        return d1 * d2;
    }
    
    boolean maior(int num1, int num2) {
        if (num1 > num2) {
            return true;
        } else {
            return false;
        }
    }
    
    void print(String texto) {
        System.out.println("Texto: " + texto);
    }
    
}
