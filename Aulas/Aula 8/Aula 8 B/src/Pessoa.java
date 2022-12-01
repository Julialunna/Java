public abstract class Pessoa {
    protected String nome;
    protected int idade;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Pessoa(String nome, int idade) {
        this.setNome(nome);
        this.setIdade(idade);
    }

    public Pessoa(){
        this.setNome("Indefinido");
        this.setIdade(0);
    }
}
