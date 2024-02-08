import java.util.ArrayList;
import java.util.Comparator;

public class Jogador implements Comparable<Jogador> {
    private String nome;
    private int idade;
    public int pontuacao;
    private int numeroTentetivas;

    public Jogador(String nome,int idade, int pontuacao, int numeroTentetivas) {
        this.nome = nome;
        this.idade = idade;
        this.pontuacao = pontuacao;
        this.numeroTentetivas = numeroTentetivas;
    }
    public static void teste(ArrayList<Jogador> lista) {
        lista.add(new Jogador("Arthur", 18, 1,7));
        lista.add(new Jogador("João", 49, 9,28));
        lista.add(new Jogador("Mario", 23, 4,17));
        lista.add(new Jogador("Pedro", 74, 12,23));
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

    @Override
    public int compareTo(Jogador outro) {
        return Integer.compare(outro.pontuacao, this.pontuacao);
    }
}
