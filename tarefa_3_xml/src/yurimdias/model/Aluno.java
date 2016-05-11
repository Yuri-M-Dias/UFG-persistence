package yurimdias.model;

/**
 * Created by Yuri on 10-May-16.
 */
public class Aluno {

    private String nome;

    private String Email;

    public Aluno(String nome, String email) {
        this.nome = nome;
        Email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
}
