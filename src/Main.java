import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        ArrayList<Jogador> jogadores = new ArrayList<>();
        String nomeJogador;
        Jogador.teste(jogadores);
        do {
            System.out.print("nome: ");
            nomeJogador = scanner.nextLine();
        } while (Jogador.jogadorRepetido(jogadores, nomeJogador));

        Collections.sort(jogadores);

        for (int i = 0; i < jogadores.size() && i < 10; i++) {
            System.out.println(jogadores.get(i).getNome() + " - " +(i + 1));
        }
    }
}