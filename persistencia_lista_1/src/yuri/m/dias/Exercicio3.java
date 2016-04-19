package yuri.m.dias;

import java.io.*;

/**
 * Created by Yuri on 19-Apr-16.
 */
public class Exercicio3 {

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
        System.out.println(primeiroStr);
    }

}
