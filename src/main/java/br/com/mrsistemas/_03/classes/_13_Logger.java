package br.com.mrsistemas._03.classes;

import java.util.Date;

/**
 *
 * @author marcondes
 */
public class _13_Logger {

    private static int quantidadeLogs;
    
    public static void logIt(String mensagem) {
        String dataHora = "" + new Date() + "";
        System.out.println(dataHora + " : " + quantidadeLogs + " : " + mensagem);
        quantidadeLogs++;
    }
    
}
