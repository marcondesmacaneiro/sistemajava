package br.com.mrsistemas._03.classes;

import java.util.logging.Logger;

/**
 *
 * @author marcondes
 */
public class _13_LoggerTeste {
    
    public static void main(String[] args) {
        _13_Logger.logIt("Logger");
        _13_Logger l = new _13_Logger();
        l.logIt("Log 2");
        l.logIt("Log 3");
    }
    
}
