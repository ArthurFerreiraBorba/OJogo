import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Jogador> jogadores = new ArrayList<>();
        Jogador.teste(jogadores);
        boolean sair1 = false;
        boolean sair2 = true;

        while (!sair1) {

            System.out.println("Escolha uma opção:");
            System.out.println("1 - Criar jogador");
            System.out.println("2 - Selecionar jogador");
            System.out.println("3 - Ver top 10");
            System.out.println("4 - ver ranking completo");
            System.out.println("5 - ver status de um jogador");
            System.out.println("0 - sair");
            System.out.print("Digite o número da opção: ");
            String opicao1 = scanner.nextLine();
            System.out.println("----------------------------------");

            switch (opicao1) {
                case "1":
                    Jogo.selecionarJogador(Jogador.criarJogador(jogadores, scanner));
                    System.out.println("----------------------------------");
                    sair2 = false;
                    break;
                case "2":
                    Collections.sort(jogadores);
                    Jogo.selecionarJogador(Jogador.listarEscolherJogador(jogadores, scanner));
                    System.out.println("----------------------------------");
                    sair2 = false;
                    break;
                case "3":
                    Collections.sort(jogadores);
                    Jogador.listarTop10Jogadores(jogadores);
                    System.out.println("----------------------------------");
                    break;
                case "4":
                    Collections.sort(jogadores);
                    Jogador.listarJogadores(jogadores);
                    System.out.println("----------------------------------");
                    break;
                case "5":
                    Collections.sort(jogadores);
                    Jogador jogadorPesquisado = Jogador.pesquisarJogador(jogadores, scanner);
                    jogadorPesquisado.verStatusJogador(jogadores);
                    break;
                case "0":
                    sair1 = true;
                    break;
                default:
                    System.out.println("Opção invalida");
                    System.out.println("----------------------------------");
            }

            while (!sair2) {

                System.out.println("Escolha uma opção:");
                System.out.println("1 - Jogar: pedra papel tesoura");
                System.out.println("2 - Jogar: descubra o número magico");
                System.out.println("0 - sair");
                System.out.print("Digite o número da opção: ");
                String opcao2 = scanner.nextLine();
                System.out.println("----------------------------------");

                switch (opcao2) {
                    case "1":
                        Jogo.jogar(scanner);
                        System.out.println("----------------------------------");
                        break;
                    case "2":
                        int tamanho = Jogo.selecionarDificuldadeNM(scanner);
                        Jogo.jogar(tamanho, scanner);
                        System.out.println("----------------------------------");
                        break;
                    case "0":
                        sair2 = true;
                        break;
                    default:
                        System.out.println("Opção invalida");
                }
            }
        }
    }
}