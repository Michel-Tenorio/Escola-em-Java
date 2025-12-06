public class Professor {
    private int id; 
    private String nome;    

    public Professor(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getID() {return id;}
    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    public String toString(){
        return "Professor {id=" + id + ", nome='" + nome + "'}";
    }
    
}
    
