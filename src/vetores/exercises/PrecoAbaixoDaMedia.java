package vetores.exercises;

import java.util.Scanner;

public class PrecoAbaixoDaMedia {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        double soma = 0;
        double media = 0;

        System.out.print("Quantos elementos vai ter o vetor: ");
        int n = sc.nextInt();

        double[] numeros = new double[n];


        for (int i = 0; i<n; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = sc.nextDouble();
            soma += numeros[i];
        }

        media = soma / n;

        System.out.printf("MÉDIA DO VETOR = %.3f%n", media);
        System.out.println("ELEMENTOS ABAIXO DA MÉDIA:");
        for (int i = 0; i<n; i++) {
            if (numeros[i] < media) {
                System.out.printf("%.1f%n", numeros[i]);
            }
        }

        sc.close();
    }
}
