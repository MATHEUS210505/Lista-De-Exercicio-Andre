import java.util.Scanner;

public class Exercicios04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Armazenar os nomes e números dos candidatos
        String[] nomes = {"Candidato 1", "Candidato 2", "Candidato 3", "Candidato 4", "Candidato 5"};
        int[] numeros = {1, 2, 3, 4, 5};

        // Inicializar os contadores de votos
        int[] votos = new int[5];

        // Receber os votos dos usuários
        System.out.print("Número de eleitores: ");
        int numEleitores = entrada.nextInt();

        for (int i = 1; i <= numEleitores; i++) {
            System.out.println("\nEleitor " + i);
            System.out.println("Escolha um candidato para votar:");
            for (int j = 0; j < nomes.length; j++) {
                System.out.println(numeros[j] + " - " + nomes[j]);
            }

            // Receber o voto do usuário
            System.out.print("Digite o número do candidato: ");
            int voto = entrada.nextInt();

            // Verificar se o número do candidato é válido
            boolean candidatoValido = false;
            for (int j = 0; j < numeros.length; j++) {
                if (voto == numeros[j]) {
                    candidatoValido = true;
                    votos[j]++;
                    break;
                }
            }

            // Exibir mensagem de confirmação do voto
            if (candidatoValido) {
                System.out.println("Voto registrado com sucesso!");
            } else {
                System.out.println("Número de candidato inválido. Voto não registrado.");
            }
        }

        // Calcular número total de votos
        int totalVotos = 0;
        for (int i = 0; i < votos.length; i++) {
            totalVotos += votos[i];
        }

        // Calcular percentual de votos
        double[] percentuais = new double[5];
        for (int i = 0; i < votos.length; i++) {
            percentuais[i] = (double) votos[i] / totalVotos * 100;
        }

        // Encontrar candidato com mais votos
        int maxVotos = votos[0];
        int indiceMaxVotos = 0;
        for (int i = 1; i < votos.length; i++) {
            if (votos[i] > maxVotos) {
                maxVotos = votos[i];
                indiceMaxVotos = i;
            }
        }

        // Verificar se há um candidato com mais de 50% dos votos
        boolean candidatoMaioria = false;
        if (percentuais[indiceMaxVotos] > 50) {
            candidatoMaioria = true;
        }

        // Exibir resultados da eleição
        System.out.println("\nResultados da Eleição:");
        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i] + ": " + votos[i] + " votos (" + percentuais[i] + "%)");
        }

        // Verificar se é necessário uma nova votação
        if (!candidatoMaioria) {
            System.out.println("\nNenhum candidato obteve mais de 50% dos votos. Iniciando nova votação...");

            // Encontrar os dois candidatos com mais votos
            int segundoMaxVotos = 0;
            int indiceSegundoMaxVotos = 0;

            for (int i = 0; i < votos.length; i++) {
                if (i != indiceMaxVotos && votos[i] > segundoMaxVotos) {
                    segundoMaxVotos = votos[i];
                    indiceSegundoMaxVotos = i;
                }
            }

            System.out.println("\nNova Votação:");
            System.out.println(numeros[indiceMaxVotos] + " - " + nomes[indiceMaxVotos]);
            System.out.println(numeros[indiceSegundoMaxVotos] + " - " + nomes[indiceSegundoMaxVotos]);
        }
    }
}
