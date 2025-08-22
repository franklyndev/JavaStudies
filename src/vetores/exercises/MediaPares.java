package vetores.exercises;

import java.util.Scanner;

public class MediaPares {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        double somaPares = 0;
        int nPares = 0;

        System.out.print("Quantos elementos vai ter o vetor: ");
        int n = sc.nextInt();

        int[] numeros = new int[n];

        for (int i = 0; i<n; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = sc.nextInt();

            if (numeros[i] % 2 == 0) {
                somaPares += numeros[i];
                nPares++;
            }
        }

        double media = somaPares / nPares;

        if (nPares == 0) {
            System.out.println("NENHUM NÚMERO PAR!");
        } else {
            System.out.printf("MÉDIA DOS PARES = %.1f", media);
        }



        sc.close();
    }
}
