import java.util.Scanner;

public class Exercicios10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o tamanho das matrizes (número de linhas e colunas): ");
        int tamanho = entrada.nextInt();

        int[][] matriz1 = new int[tamanho][tamanho];
        int[][] matriz2 = new int[tamanho][tamanho];

        System.out.println("Digite os valores da primeira matriz:");
        lerValoresMatriz(matriz1, entrada);

        System.out.println("Digite os valores da segunda matriz:");
        lerValoresMatriz(matriz2, entrada);


        int[][] matrizResultado = new int[tamanho][tamanho];
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                matrizResultado[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        System.out.println("Matriz resultante (soma das matrizes):");
        exibirMatriz(matrizResultado);
    }

    public static void lerValoresMatriz(int[][] matriz, Scanner entrada) {
        int tamanho = matriz.length;

        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                System.out.print("Digite o valor da posição [" + i + "][" + j + "]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }
    }

    public static void exibirMatriz(int[][] matriz) {
        int tamanho = matriz.length;

        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
