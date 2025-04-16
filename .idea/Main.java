import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner aleatorio = new Scanner(System.in);
        Random random = new Random();
         int numeroAleatorio = random.nextInt(101);
        int tentativas = 5;
        System.out.println("Jogo de Adivinhação");

        for (int i = 0; i < tentativas; i++) {
            System.out.println("Digite um numero (0 a 100)");
            int numeroUsuario = aleatorio.nextInt();

            if (numeroUsuario == numeroAleatorio) {
                System.out.println("Parabéns! Você acertou o numero: " + numeroAleatorio);
                break;
            } else if (numeroUsuario > numeroAleatorio) {
                System.out.println("O numero digitado é maior que o numero secreto");
            } else {
                System.out.println("O numero digitado é menor que o numero secreto");
            }

            if (i == tentativas -1) {
                System.out.println("Suas tentativas acabaram! O numero era: " + numeroAleatorio);
            }
        }
        aleatorio.close();
    }
}
