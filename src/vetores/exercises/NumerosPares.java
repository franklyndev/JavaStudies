package vetores.exercises;

import java.util.Scanner;

public class NumerosPares {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int quantidadePares = 0;

        System.out.print("Quantos números você vai digitar: ");
        int n = sc.nextInt();
        int[] numeros = new int[n];
        for (int i = 0; i<n; i++){
            System.out.printf("Digite o %dº número: ", i+1);
            numeros[i] = sc.nextInt();
        }

        System.out.println("NÚMEROS PARES:");
        for (int i = 0; i<n; i++){
            if (numeros[i] % 2 == 0) {
                System.out.print(numeros[i] + " ");
                quantidadePares++;
            }

        }
        System.out.println("");
        System.out.printf("QUANTIDADE DE PARES = %d%n", quantidadePares);
        sc.close();
    }
}
