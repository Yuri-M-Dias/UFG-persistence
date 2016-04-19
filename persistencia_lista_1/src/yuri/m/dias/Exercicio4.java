package yuri.m.dias;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Verifica se possui assinatura de PDF.
 * <a href="https://en.wikipedia.org/wiki/Magic_number_%28programming%29">Source</a>
 * Created by Yuri on 19-Apr-16.
 */
public class Exercicio4 {

    public static void main(String[] args) throws IOException {
        String nomeArquivo = args[0];
        if(nomeArquivo == null || nomeArquivo.equals("") || args.length > 1){
            System.out.println("Falta o nome do arquivo!");
            System.exit(0);
        }
        System.out.println("Lendo do arquivo: " + nomeArquivo);
        FileInputStream fis = new FileInputStream(nomeArquivo);
        DataInputStream dis = new DataInputStream(fis);
        int primeiro = dis.readInt();
        dis.close();
        String primeiroStr = Integer.toHexString(primeiro).toUpperCase();
        String assinaturaPDF = "25504446";//Magic number!
        if(primeiroStr.equals(assinaturaPDF))
            System.out.println("É PDF!");
        else
            System.out.println("Não é PDF!");
        System.out.println(primeiroStr);
    }

}
