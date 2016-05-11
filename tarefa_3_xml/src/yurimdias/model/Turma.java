package yurimdias.model;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by Yuri on 10-May-16.
 */
@XmlRootElement
public class Turma {

    List<Aluno> alunos;

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }
}
