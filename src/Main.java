import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        ArrayList<Jogador> jogadores = new ArrayList<>();
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
                Jogo.selecionarJogador(Jogador.criarJogador(jogadores,scanner));
                break;
            case "2":
                Jogo.selecionarJogador(Jogador.listarEscolherJogador(jogadores, scanner));
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
        System.out.println("1 - Jogar: pedra papel tesoura");
        System.out.println("2 - Jogar: descubra o número magico");
        System.out.println("0 - sair");
        System.out.print  ("Digite o número da opção: ");
        String opcao2 = scanner.nextLine();

        switch (opcao2) {
            case "1":
                Jogo.jogar(scanner);
                break;
            case "2":
                System.out.println("Escolha a dificuldade:");
                System.out.println("1 - difícil   (1 - 100)");
                System.out.println("2 - médio     (1 - 75)");
                System.out.println("3 - fácil     (1 - 50)");
                int resposta = Integer.parseInt(scanner.nextLine());

                int tamanho = 100 - (25 * (resposta - 1));
                System.out.println(tamanho);
                Jogo.jogar(tamanho, scanner);
                break;
            case "0":
                return;
        }

        Collections.sort(jogadores);
        Jogo.setMelhorJogador(jogadores.get(0));
    }
}