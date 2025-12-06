import java.util.ArrayList;
import java.util.List;

public class EscolaRepository {

    private List<Aluno> alunos = new ArrayList<>();
    private List<Professor> professores = new ArrayList<>();
    private List<Classe> classes = new ArrayList<>();

    // ALUNO 
    public void criarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public List<Aluno> listaAluno() {
        return alunos;
    }

    public Aluno buscarAlunoPorId(int id) {
        for (Aluno aluno : alunos) {
            if (aluno.getId() == id) {
                return aluno;
            }
        }
        return null;
    }

    public void atualizarAluno(int id, String novoNome) {
        Aluno aluno = buscarAlunoPorId(id);
        if (aluno != null) {
            aluno.setNome(novoNome);
        }
    }

    public void deletarAluno(int id) {
        Aluno aluno = buscarAlunoPorId(id);
        if (aluno != null) {
            alunos.remove(aluno);
        }
    }

    // PROFESSOR 
    public void criarProfessor(Professor professor) {
        professores.add(professor);
    }

    public List<Professor> listarProfessores() {
        return professores;
    }

    public Professor buscarProfessorPorId(int id) {
        for (Professor professor : professores) {
            if (professor.getID() == id) {
                return professor;
            }
        }
        return null;
    }

    public void atualizarProfessor(int id, String novoNome) {
        Professor professor = buscarProfessorPorId(id);
        if (professor != null) {
            professor.setNome(novoNome);
        }
    }

    public void deletarProfessor(int id) {
        professores.removeIf(p -> p.getID() == id);
    }

    // CLASSE 
    public void criarClasse(Classe classe) {
        classes.add(classe);
    }

    public List<Classe> listarClasse() {
        return classes;
    }

    public Classe buscarClassePorId(int id) {
        for (Classe classe : classes) {
            if (classe.getId() == id) {
                return classe;
            }
        }
        return null;
    }

    public void atualizarClasse(int id, String novoNome) {
        Classe classe = buscarClassePorId(id);
        if (classe != null) {
            classe.setNome(novoNome);
        }
    }

    public void deletarClasse(int id) {
        classes.removeIf(c -> c.getId() == id);
    }
}