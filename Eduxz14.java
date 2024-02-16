public class Eduxz14 {
    private String nome ="Eduardo";
    private String githubUser = "Eduxz14";
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGithubUser() {
        return githubUser;
    }

    public void setGithubUser(String githubUser) {
        this.githubUser = githubUser;
    }

    @Override
    public String toString() {
        return "Olá meu nome é: " + nome + "\nEsse é meu GitHub: " + githubUser;
    }
}
