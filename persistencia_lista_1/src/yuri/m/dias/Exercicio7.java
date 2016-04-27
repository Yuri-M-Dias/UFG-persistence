package yuri.m.dias;

import java.io.*;

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
        if (linha < 0) {
            System.out.println("Linha negativa não existe!");
            System.exit(0);
        }
        FileInputStream fis = new FileInputStream(arquivoFonte);
        DataInputStream dis = new DataInputStream(fis);
        try {
            dis.skipBytes((linha - 1) * Integer.BYTES);
            int posicaoLinha = dis.readInt();
            dis.skipBytes(posicaoLinha - (Integer.BYTES * linha));
            int qtdBytesLinha = dis.readInt();
            byte[] readBytes = new byte[qtdBytesLinha];//Reads size
            int numBytesLidos = dis.read(readBytes, 0, qtdBytesLinha);
            if (numBytesLidos != qtdBytesLinha) {
                System.out.println("Erro na leitura!");
                System.exit(0);
            }
            String linhaResultado = new String(readBytes, "UTF-8");
            System.out.println(linhaResultado);
        } catch (EOFException e) {
            System.out.println("Linha não encontrada!");
        } finally {
            dis.close();
        }
    }
}
