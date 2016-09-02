package br.com.mrsistemas._03.heranca;

/**
 *
 * @author marcondes
 */
public class _01_CalculadoraPlusTeste {
    
    public static void main(String[] args) {
        _01_Calculadora c = new _01_Calculadora();
        int resultado1 = c.soma(10, 37);
        System.out.println("Resultado 1: " + resultado1);
        
        _01_CalculadoraPlus cp = new _01_CalculadoraPlus();
        double resultado2 = cp.soma(20, 79);
        System.out.println("Soma 2: " + resultado2);
        
        _01_CalculadoraPlus cp2 = new _01_CalculadoraPlus();
        double resultado3 = cp2.multiplicacao(20, 79);
        System.out.println("Multiplicação: " + resultado3);
    }
    
}
