package br.com.mrsistemas._03.classes;

/**
 *
 * @author marcondes
 */
public class _10_Finalize {

    private int id;

    public _10_Finalize(int id) {
        this.id = id;
    }
    
    public void finalize() {
        System.out.println("Removendo o objeto " + id + " da memória.");
    }
    
}
