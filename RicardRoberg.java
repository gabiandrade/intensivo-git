public class RicardRoberg {

    private String nome = "Ricard";
    private String githubUser = "ricardroberg";

    public RicardRoberg(String nome, String githubYser) {
        this.nome = nome;
        this.githubUser = githubYser;
    }

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
        return "Olá,  meu nome é " + nome + "\n e esse é meu usuário do Github" + githubUser ;
    }
}
