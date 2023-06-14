import java.util.Scanner;

public class Exercicios06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Conversor de Temperatura");
        System.out.println("Selecione a opção desejada:");
        System.out.println("1 - Celsius para Fahrenheit");
        System.out.println("2 - Fahrenheit para Celsius");
        int opcao = entrada.nextInt();

        if (opcao == 1) {
            System.out.print("Digite a temperatura em Celsius: ");
            double celsius = entrada.nextDouble();
            double fahrenheit = (celsius * 9 / 5) + 32;
            System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);
        } else if (opcao == 2) {
            System.out.print("Digite a temperatura em Fahrenheit: ");
            double fahrenheit = entrada.nextDouble();
            double celsius = (fahrenheit - 32) * 5 / 9;
            System.out.println("A temperatura em Celsius é: " + celsius);
        } else {
            System.out.println("Opção inválida.");
        }
    }
}
