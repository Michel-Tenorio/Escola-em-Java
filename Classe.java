
public class Classe {
    private int id;
    private String nome;
    private Professor professor;

    public Classe(int id, String nome, Professor professor) {
        this.id = id;
        this.nome = nome;
        this.professor = professor;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public String toString() {
        return "Classe{id=" + id + ", nome='" + nome + "', professor=" + professor.getNome() + "}";
    }
}