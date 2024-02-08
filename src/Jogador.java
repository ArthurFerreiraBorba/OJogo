public class Jogador {
    private String nome;
    private int idade;
    private int pontuacao;
    private int numeroTentetivas;

    public Jogador(String nome,int idade, int pontuacao, int numeroTentetivas) {
        this.nome = nome;
        this.idade = idade;
        this.pontuacao = pontuacao;
        this.numeroTentetivas = numeroTentetivas;
    }
    public void adicionaPonto() {
     this.pontuacao++;
    }
    public void perdePonto() {
        this.pontuacao--;
    }
    public void adicionarTentativa() {
        this.numeroTentetivas++;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public int getNumeroTentetivas() {
        return numeroTentetivas;
    }

    public void setNumeroTentetivas(int numeroTentetivas) {
        this.numeroTentetivas = numeroTentetivas;
    }

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
}
