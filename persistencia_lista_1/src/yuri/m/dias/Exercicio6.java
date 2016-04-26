package yuri.m.dias;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by Yuri on 26-Apr-16.
 */
public class Exercicio6 {

    public static void main(String[] args) throws IOException {
        String arquivoFonte = args[0];
        if ((arquivoFonte == null) || arquivoFonte.equals("") || args.length
                != 1) {
            System.out.println("Falta o nome do arquivo de fonte!");
            System.exit(0);
        }
        FileInputStream fis = new FileInputStream(arquivoFonte);
        DataInputStream dis = new DataInputStream(fis);
        Integer currentLineSize = dis.readInt();//first line
        while (currentLineSize != -1) {
            byte[] readBytes = new byte[currentLineSize];//Reads size
            dis.read(readBytes, 0, currentLineSize);//Reads content
            String linha = new String(readBytes, "UTF-8");//converts
            System.out.println(linha);
            if(dis.available() > 0){
              currentLineSize = dis.readInt();
            } else{
                currentLineSize = -1;
            }
        }
        dis.close();
    }
}
