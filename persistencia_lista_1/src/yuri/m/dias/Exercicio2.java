package yuri.m.dias;

import java.io.*;

/**
 * Created by Yuri on 19-Apr-16.
 */
public class Exercicio2 {

    public static void main(String[] args) throws IOException {
        String nomeArquivo = args[0];
        if(nomeArquivo == null || nomeArquivo.equals("")){
            System.out.println("Falta o nome do arquivo!");
            System.exit(0);
        }
        System.out.println("Lendo do arquivo: " + nomeArquivo);
        FileInputStream fis = new FileInputStream(nomeArquivo);
        InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
        BufferedReader br = new BufferedReader(isr);
        String linha;
        while ((linha = br.readLine()) != null) {
            System.out.println(linha);
        }
        br.close();
    }

}
