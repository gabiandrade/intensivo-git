class User{
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getgithubUser() {
        return githubUser;
    }

    public void setgithubUser(String githubUser) {
        this.githubUser = githubUser;
    }

    public User(String nome, String githubUser) {
        this.nome = nome;
        this.githubUser = githubUser;
    }

    private String nome;
    private String githubUser;
}