import java.util.Scanner;

public class Exercicios08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        int countPares = 0;
        int countImpares = 0;

        System.out.print("Digite uma sequência de números inteiros positivos (digite 0 para encerrar): ");

        do {
            numero = entrada.nextInt();

            if (numero % 2 == 0 && numero != 0) {
                countPares++;
            } else if (numero != 0) {
                countImpares++;
            }
        } while (numero != 0);

        System.out.println("Quantidade de números pares digitados: " + countPares);
        System.out.println("Quantidade de números ímpares digitados: " + countImpares);
    }
}
