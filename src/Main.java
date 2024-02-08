import java.util.ArrayList;
import java.util.Collections;


public class Main {
    public static void main(String[] args) {
        ArrayList<Jogador> jogadores = new ArrayList<>();

        Jogador.teste(jogadores);

        Collections.sort(jogadores);

        for (Jogador j: jogadores) {
            System.out.println(j.pontuacao);
        }
    }
}