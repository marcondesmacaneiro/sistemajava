package br.com.mrsistemas._03.classes;

/**
 *
 * @author marcondes
 */
public class _05_Sobrecarga {
    
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
    
    public static void main(String[] args) {
        _05_Sobrecarga t = new _05_Sobrecarga();
        float b1 = 1.5f;
        float b2 = (float) 1.6;
        t.soma(b1, b2);
    }
    
}
