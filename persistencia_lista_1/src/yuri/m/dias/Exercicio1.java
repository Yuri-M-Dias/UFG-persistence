package yuri.m.dias;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class Exercicio1 {

    public static void main(String[] args) throws FileNotFoundException,
            UnsupportedEncodingException {
        String nomeArquivo = args[0];
        String caracteres = args[1];
        System.out.println("Escrevendo: " + caracteres + " no arquivo " +
                nomeArquivo);
        PrintWriter pw = null;
        pw = new PrintWriter(nomeArquivo, "UTF-8");
        pw.write(caracteres);
        pw.close();
    }

}
