import java.util.Scanner;

public class Exercicios03 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int Nome;
        double PrimeiraNota, SegundaNota, TerceiraNota, QuartaNota, QuintaNota, RecuperacaoNota, Media;
        boolean Aprovacao = false;

      	System.out.print("Verificador de notas\n\n");

        System.out.print("Digite o seu nome:  ");
        Nome = entrada.nextInt();


        System.out.print("Digite a primeira nota:  ");
        PrimeiraNota = entrada.nextDouble();

        System.out.print("Digite a segunda nota:  ");
        SegundaNota = entrada.nextDouble();

        System.out.print("Digite a terceira nota:  ");
        TerceiraNota = entrada.nextDouble();

        System.out.print("Digite a quarta nota:  ");
        QuartaNota = entrada.nextDouble();

        System.out.print("Digite a quinta nota:  ");
        QuintaNota = entrada.nextDouble();


        Media = (PrimeiraNota + SegundaNota + TerceiraNota + QuartaNota + QuintaNota)/5;

    
        if (Media >= 60) {
            System.out.print("O aluno foi Aprovado");
        } else if (Media <= 40) {
            System.out.print("O aluno foi Reprovado");
        } else {
            System.out.print("O aluno ficou de recuperação");
        }

     }
   }
