package br.com.mrsistemas._03.classes;

/**
 *
 * @author marcondes
 */
public class _11_Carro {
    
    private String placa;
    private String fabricante;
    private int velocidade;
    private static int velocidadeMaxiamPermitida = 60;

    public _11_Carro(String placa, String fabricante, int velocidade) {
        this.placa = placa;
        this.fabricante = fabricante;
        this.velocidade = velocidade;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public static int getVelocidadeMaxiamPermitida() {
        return velocidadeMaxiamPermitida;
    }

    public static void setVelocidadeMaxiamPermitida(int velocidadeMaxiamPermitida) {
        _11_Carro.velocidadeMaxiamPermitida = velocidadeMaxiamPermitida;
    }
    
    public boolean ultrapassouLimiteDeVelocidade() {
        return velocidade > velocidadeMaxiamPermitida;
    }
    
}
