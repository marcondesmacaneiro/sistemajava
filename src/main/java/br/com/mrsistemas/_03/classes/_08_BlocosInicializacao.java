package br.com.mrsistemas._03.classes;

/**
 *
 * @author marcondes
 */
public class _08_BlocosInicializacao {

    private int atributo = 15;
    
    {
        System.out.println("Dentro da Inicialização da Instância");
        System.out.println("Valor do atributo = " + atributo);
    }

    public _08_BlocosInicializacao() {
        System.out.println("Dentro do construtor.");
    }
    
    public static void main(String[] args) {
        _08_BlocosInicializacao c = new _08_BlocosInicializacao();
    }
    
}
