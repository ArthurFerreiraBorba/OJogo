import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Jogo {
    private static Jogador melhorJogador;
    private static int numeroJogadas;

    public static void verNumeroJogadas() {
        System.out.println(numeroJogadas);
    }
    public static void PedraPapelTesoura(Jogador jogador) {
        numeroJogadas++;
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> opicoes = new ArrayList<String>() { { add("pedra"); add("papel"); add("tesoura"); } };
        Random random = new Random();

        System.out.println("Bem vindo ao pedra papel tesoura \n\n");
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Pedra");
        System.out.println("2 - Papel");
        System.out.println("3 - tesoura");
        int r = Integer.parseInt(scanner.nextLine());

        String resultado = null;
        String respostaPrograma = opicoes.get(random.nextInt(0, 3));
        String respostaJogador = opicoes.get(r - 1);

        switch (respostaJogador) {

            case "pedra":
                switch (respostaPrograma) {
                    case "pedra":
                        resultado = " você empatou";
                        break;
                    case "papel":
                        resultado = " é uma pena você perde";
                        jogador.setPontuacao(jogador.getPontuacao() - 1);
                        break;
                    case "tesoura":
                        resultado = " parabens você ganhou";
                        jogador.setPontuacao(jogador.getPontuacao() + 1);
                        break;
                }
                break;

            case "papel":
                switch (respostaPrograma) {
                    case "pedra":
                        resultado = " parabens você ganhou";
                        jogador.setPontuacao(jogador.getPontuacao() + 1);
                        break;
                    case "papel":
                        resultado = " você empatou";
                        break;
                    case "tesoura":
                        resultado = " é uma pena você perde";
                        jogador.setPontuacao(jogador.getPontuacao() - 1);
                        break;
                }
                break;

            case "tesoura":
                switch (respostaPrograma) {
                    case "pedra":
                        resultado = " é uma pena você perdeu";
                        jogador.setPontuacao(jogador.getPontuacao() - 1);
                        break;
                    case "papel":
                        resultado = " parabens você ganhou";
                        jogador.setPontuacao(jogador.getPontuacao() + 1);
                        break;
                    case "tesoura":
                        resultado = " você empatou";
                        break;

                }
                break;
        }

        System.out.println("Você escolheu " + respostaJogador + " seu oponente escolheu " + respostaPrograma + resultado);
    }

    public static void setMelhorJogador(Jogador melhorJogador) {
        Jogo.melhorJogador = melhorJogador;
    }
}
