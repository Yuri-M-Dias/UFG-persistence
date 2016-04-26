package yuri.m.dias;

import java.io.IOException;
import java.io.InterruptedIOException;

/**
 * Created by Yuri on 26-Apr-16.
 */
public class Exercicio7 {

    public static void main(String[] args) throws IOException {
        String arquivoFonte = args[0];
        String linhaDestino = args[1];
        if ((arquivoFonte == null) || arquivoFonte.equals("") || (linhaDestino
                == null) || (args.length != 2) || linhaDestino.equals("")) {
            System.out.println("Falta o nome do arquivo de fonte ou o número " +
                    "da linha desejada!");
            System.exit(0);
        }
        Integer linha = Integer.parseInt(linhaDestino);
        //TODO: this!
        System.out.println("Lendo do arquivo: " + arquivoFonte);

    }
}
