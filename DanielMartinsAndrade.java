public class DanielMartinsAndrade {

    private String nome;
    private String gitHubUser;

    // Construtor
    public DanielMartinsAndrade(String nome, int idade, String gitHubUser) {
        this.nome = nome;
        this.gitHubUser = gitHubUser;
    }

    @Override
    public String toString() {
        return "O aluno " + nome + " do curso de desenvolvedor back-end da Ada está no Github sob o usuário " + gitHubUser;
    }
}