import java.util.ArrayList;
import java.util.Collections;


public class Main {
    public static void main(String[] args) {
        ArrayList<Jogador> jogadores = new ArrayList<>();

        Jogador.teste(jogadores);

        Collections.sort(jogadores);

        for (int i = 0; i < jogadores.size() && i < 10; i++) {
            System.out.println(jogadores.get(i).getNome() + " - " +(i + 1));
        }
    }
}