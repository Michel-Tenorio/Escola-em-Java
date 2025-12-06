public class main {
    public static void Main(String[] args) {

        EscolaRepository repo = new EscolaRepository();

        Professor prof1 = new Professor(1, "Ana");
        repo.criarProfessor(prof1);

        Aluno a1 = new Aluno(1, "João");
        Aluno a2 = new Aluno(2, "Maria");
        repo.criarAluno(a1);
        repo.criarAluno(a2);

        Classe c1 = new Classe(1, "1A", prof1);
        repo.criarClasse(c1);

        System.out.println("Alunos:");
        for (Aluno a : repo.listaAluno()) {
            System.out.println(a);
        }

        System.out.println("Professores:");
        for (Professor p : repo.listarProfessores()) {
            System.out.println(p);
        }

        System.out.println("Classes:");
        for (Classe c : repo.listarClasse()) {
            System.out.println(c);
        }

        // Testando atualização
        repo.atualizarAluno(1, "João Silva");
        repo.atualizarClasse(1, "1A - Atualizada");

        System.out.println("Após atualizar:");
        for (Classe c : repo.listarClasse()) {
            System.out.println(c);
        }
    }
}
