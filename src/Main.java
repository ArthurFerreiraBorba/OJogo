import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        ArrayList<Jogador> jogadores = new ArrayList<>();
        Jogador jogadorSelecionado = null;
        Jogador.teste(jogadores);

        System.out.println("Escolha uma opção:");
        System.out.println("1 - Criar jogador");
        System.out.println("2 - Selecionar jogador");
        System.out.println("3 - Ver top 10 jogadores");
        System.out.println("4 - ver todos os jogadores");
        System.out.println("0 - sair");
        System.out.print  ("Digite o número da opção: ");
        String opicao1 = scanner.nextLine();

        switch (opicao1) {
            case "1":
                jogadorSelecionado = Jogador.criarJogador(jogadores,scanner);
                break;
            case "2":
                jogadorSelecionado = Jogador.selecionarJogador(jogadores,scanner);
                break;
            case "3":
                Jogador.listarTop10Jogadores(jogadores);
                break;
            case "4":
                Jogador.listarJogadores(jogadores);
                break;
            case "0":
                return;
        }
        
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Jogar");
        System.out.println("0 - sair");
        System.out.print  ("Digite o número da opção: ");
        String opcao2 = scanner.next();

        switch (opcao2) {
            case "1":
                Jogo.PedraPapelTesoura(jogadorSelecionado);
                break;
            case "0":
                return;
        }

        Collections.sort(jogadores);
        Jogo.setMelhorJogador(jogadores.get(0));
    }
}