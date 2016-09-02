package br.com.mrsistemas.testes;

/**
 *
 * @author marcondes
 */
public class PessoaTest {
    
    private Pessoa[] pessoas = new Pessoa[1000];
    
    public static void main(String[] args) {
        PessoaTest pTeste= new PessoaTest();
        pTeste.executar();
    }
    
    public void executar () {
        while (true) {
            for (int i = 0; i < pessoas.length; i++) {
                if (pessoas[i]==null) {
                    Pessoa p = new Pessoa("Teste");
                    pessoas[i] = p;
                    break;
                }
                //System.err.println("For " + i);
            }
            
              
            int valor = (int) (Math.random() * (1000 - 900) + 900);
            if (pessoas[valor] instanceof Pessoa) {
                pessoas[valor] = null;
            }

            System.gc();
        }
    }
    
}
