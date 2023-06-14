import java.util.Scanner;

public class Exercicios09 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a quantidade de alunos: ");
        int quantidadeAlunos = entrada.nextInt();

        double[] notas = new double[quantidadeAlunos];

        for (int i = 0; i < quantidadeAlunos; i++) {
            System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
            notas[i] = entrada.nextDouble();
        }

        double soma = 0;
        for (int i = 0; i < quantidadeAlunos; i++) {
            soma += notas[i];
        }
        double media = soma / quantidadeAlunos;

        System.out.println("A média das notas é: " + media);
    }
}

