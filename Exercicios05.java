import java.util.Random;

public class Exercicios05 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numeros = new int[100];
        int soma = 0;
        int countPares = 0;
        int countImpares = 0;

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(100);
            soma += numeros[i];
        }

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                countPares++;
            } else {
                countImpares++;
            }
        }

        System.out.println("Soma de todos os números: " + soma);
        System.out.println("Quantidade de números pares: " + countPares);
        System.out.println("Quantidade de números ímpares: " + countImpares);
        System.out.println("Números gerados:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
    }
}
