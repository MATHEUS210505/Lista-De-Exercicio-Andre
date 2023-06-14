import java.util.Random;
import java.util.Scanner;

public class Exercicios07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();

        int numeroAleatorio = random.nextInt(100) + 1;
        int palpite;

        System.out.println("Bem-vindo ao jogo Adivinhe o Número!");

        do {
            System.out.print("Digite seu palpite (entre 1 e 100): ");
            palpite = entrada.nextInt();

            if (palpite < numeroAleatorio) {
                System.out.println("Seu palpite é menor do que o número gerado. Tente novamente!");
            } else if (palpite > numeroAleatorio) {
                System.out.println("Seu palpite é maior do que o número gerado. Tente novamente!");
            } else {
                System.out.println("Parabéns! Você acertou o número!");
            }
        } while (palpite != numeroAleatorio);

        System.out.println("Fim do jogo.");
    }
}
