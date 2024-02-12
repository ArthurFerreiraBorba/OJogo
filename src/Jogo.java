import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Jogo {
    private static Jogador jogadorSelecionado;
    private static Jogador melhorJogador;
    private static int numeroJogadas;

    public static void selecionarJogador(Jogador jogador) {
        jogadorSelecionado = jogador;
    }

    public static void jogar(Scanner s) {
        try {
            jogadorSelecionado.adicionarTentativa();
            numeroJogadas++;
            ArrayList<String> opcoes = new ArrayList<>() {
                {
                    add("pedra");
                    add("papel");
                    add("tesoura");
                    add("pedra");
                    add("papel");
                }
            };

            Random random = new Random();

            System.out.println("Bem vindo ao pedra papel tesoura");

            int r = escolherOpcaoPPT(s);

            String resultado = null;
            String respostaPrograma = opcoes.get(random.nextInt(0, 3));
            String respostaJogador = opcoes.get(r - 1);
            String empate = opcoes.get(r - 1);
            String derrota = opcoes.get(r);
            String vitoria = opcoes.get(r + 1);


            if (respostaPrograma.equals(empate)) {
                resultado = ", você empatou";
            } else if (respostaPrograma.equals(derrota)) {
                resultado = ", é uma pena você perde";
                jogadorSelecionado.perdePonto();
            } else if (respostaPrograma.equals(vitoria)) {
                resultado = ", parabens você ganhou";
                jogadorSelecionado.adicionaPonto();
            }

            System.out.println("Você escolheu " + respostaJogador + " seu oponente escolheu " + respostaPrograma + resultado);
        } catch (NullPointerException exp) {
            System.out.println("[ERRO] Nenhum jogador selecionado");
        } catch (Exception exp) {
            System.out.println("[ERRO]");
        }
    }

    private static int escolherOpcaoPPT(Scanner s) {
        System.out.println("\n\nEscolha uma opção:");
        System.out.println("1 - Pedra");
        System.out.println("2 - Papel");
        System.out.println("3 - tesoura");
        int r = Integer.parseInt(s.nextLine());

        if (r < 1 || r > 3) {
            System.out.println("[ERRO] Opção invalida");
            return escolherOpcaoPPT(s);
        }
        return r;
    }

    public static void jogar(int tamanho, Scanner s) {
        try {
            jogadorSelecionado.adicionarTentativa();
            numeroJogadas++;

            Random random = new Random();
            int numeroMagico = random.nextInt(1, tamanho);

            if (numeroMagico(numeroMagico, s)) {
                jogadorSelecionado.perdePonto();
            } else {
                jogadorSelecionado.adicionaPonto();
            }
        }catch (NullPointerException exp) {
            System.out.println("[ERRO] Nenhum jogador selecionado");
        } catch (Exception exp) {
            System.out.println("[ERRO]");
        }
    }
    public static Boolean numeroMagico(int numeroMagico, Scanner s) {
        String stringTentativas = "Tentativas: [********]";

        for (byte i = 0; i <= 8; i++){
            System.out.println(stringTentativas);
            System.out.print  ("Tente acertar o número magico:");
            int resposta = Integer.parseInt(s.nextLine());

            if (resposta > numeroMagico) {
                System.out.println("O número magico é MENOR que o número escolhido");
            } else if (resposta < numeroMagico) {
                System.out.println("O número magico é MAIOR que o número escolhido");
            } else {
                System.out.println("Parabens você acertou o número magico");
                return true;
            }

            stringTentativas = stringTentativas.substring(0, i + 13) + " " + stringTentativas.substring(i + 14);
        }

        System.out.println("Você perdeu");
        return false;
    }

    public static void verNumeroJogadas() {
        System.out.println(numeroJogadas);
    }

    public static void setMelhorJogador(Jogador melhorJogador) {
        Jogo.melhorJogador = melhorJogador;
    }
}
