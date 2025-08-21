package vetores.exercises;

import java.util.Scanner;

public class SomaVetor {

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar: ");
        int n = sc.nextInt();
        double[] vect = new double[n];
        // Digitar os números
        for (int i = 0; i<vect.length; i++){
            System.out.print("Digite um número: ");
            vect[i] = sc.nextInt();
        }

        System.out.print("VALORES = ");
        // Mostrar valores
        for (int i = 0; i<n; i++){
            if (i + 1 == n) {
                System.out.printf("%.2f ", vect[i]);
            } else{
                System.out.printf("%.2f | ", vect[i]);
            }
        }
        System.out.println("");
        // Somar valores
        double sum = 0;

        System.out.print("SOMA = ");
        for (int i = 0; i<n; i++){
            sum += vect[i];
        }
        System.out.printf("%.2f ", sum);

        System.out.println("");
        // Mostrar média
        double media;

        media = sum / vect.length;
        System.out.printf("Média: %.2f", media);

        sc.close();
    }

}
