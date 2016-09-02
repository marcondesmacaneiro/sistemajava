package br.com.mrsistemas._03.classes;

/**
 *
 * @author marcondes
 */
public class _05_Varargs {
    
    public int soma(int a, int b) {
        return a + b;
    }
    public int soma(int a, int b, int c) {
        return this.soma(a, b) + c;
    }
    public float soma(float a, float b) {
        return a + b;
    }
    public long soma(long a, long b) {
        return a + b;
    }
    
    //TODO Demonstração de varargs
    public int soma(int... params) {
        int soma = 0;
        for (int i = 0; i < params.length; i++) {
            soma += params[i];
        }
        return soma;
    }
    
}
