package yurimdias.Exercicio2;

import yurimdias.NaoSerializavelMain;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Yuri on 03-May-16.
 */
public class Exercicio2Main {

    private static final int TAMANHO_ARRAY = 500;

    public static void main(String[] args) throws IOException {
        TesteTamanhoArrayList teste = new TesteTamanhoArrayList();
        TesteTamanhoVetor testeTamanhoVetor = new TesteTamanhoVetor();
        int[] arrayInteiro = new int[TAMANHO_ARRAY];
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        for (int i = 0; i < TAMANHO_ARRAY; i++) {
            arrayInteiro[i] = i;
            integerArrayList.add(i, i);
        }
        teste.setListInteiro(integerArrayList);
        testeTamanhoVetor.setArrayInteiro(arrayInteiro);
        System.out.println("Tamanho ArrayList = " + NaoSerializavelMain
                .TamanhoEmBytes(teste));
        System.out.println("Tamanho Vetor de Inteiro = " + NaoSerializavelMain
                .TamanhoEmBytes(testeTamanhoVetor));
    }

}
