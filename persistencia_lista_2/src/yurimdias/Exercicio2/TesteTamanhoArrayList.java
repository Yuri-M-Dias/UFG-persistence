package yurimdias.Exercicio2;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Yuri on 03-May-16.
 */
public class TesteTamanhoArrayList implements Serializable {

    public List<Integer> listInteiro;

    public List<Integer> getListInteiro() {
        return listInteiro;
    }

    public void setListInteiro(List<Integer> listInteiro) {
        this.listInteiro = listInteiro;
    }
}
