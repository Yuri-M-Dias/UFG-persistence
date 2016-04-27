package yuri.m.dias;

import java.io.*;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * Verifica se possui assinatura de PDF.
 * <a href="https://en.wikipedia.org/wiki/Magic_number_%28programming%29">Source</a>
 * Created by Yuri on 19-Apr-16.
 */
public class Exercicio5 {

    private static final String ENCODING = "UTF-8";

    public static void main(String[] args) throws IOException {
        String arquivoFonte = args[0];
        String arquivoDestino = args[1];
        if ((arquivoFonte == null) || arquivoFonte.equals("") || (arquivoDestino
                == null) || (args.length != 2) || arquivoDestino.equals("")) {
            System.out.println("Falta o nome do arquivo de fonte ou de " +
                    "destino!");
            System.exit(0);
        }

        System.out.println("Lendo do arquivo: " + arquivoFonte);
        //Lê do source
        FileInputStream fis = new FileInputStream(arquivoFonte);
        InputStreamReader isr = new InputStreamReader(fis, ENCODING);
        BufferedReader br = new BufferedReader(isr);
        List<EachLine> lineToByte = new ArrayList<>();
        String linha;
        while ((linha = br.readLine()) != null) {
            byte[] bytesLinha = linha.getBytes(Charset.forName(ENCODING));
            lineToByte.add(new EachLine(bytesLinha));
            //byte result = Byte.parseByte(linha);
            String check = new String(bytesLinha, ENCODING);
            if (!check.equals(linha)) {
                System.out.println("Error converting from bytes to string!");
            }
            System.out.println(check + " =? " + linha);
        }
        br.close();

        //Escreve pro dest
        FileOutputStream fos = new FileOutputStream(arquivoDestino);
        DataOutputStream dos = new DataOutputStream(fos);

        //index : {começo_arquivo*4}{pos_len_1}{pos_len_l2}{len_l1}{l1
        // }{len_l2}{l2}
        int numeroLinhas = lineToByte.size();
        int[] index = new int[numeroLinhas + 1];
        //Posição final do index, e começo do arquivo de fato
        index[0] = numeroLinhas * Integer.BYTES;
        for (int i = 0; i < numeroLinhas; i++) {
            //tamanho atual + tamanho da linha atual + int offset
            int tamanhoDaLinha = lineToByte.get(i).getSize();
            //Faz o próximo
            index[i+1] = index[i] + tamanhoDaLinha + Integer.BYTES;
            //Escreve o atual no arquivo
            dos.writeInt(index[i]);
        }
        //Escreve o conteúdo do arquivo em si, final do index
        lineToByte.forEach(eachLine -> {
            try {
                dos.writeInt(eachLine.getSize());// Tamanho da linha
                dos.write(eachLine.getBytes());// Conteúdo da linha
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        dos.close();

    }

}
