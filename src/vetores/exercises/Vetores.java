package vetores.exercises;

import java.util.Scanner;

public class Vetores {
    public static void main(String [] agrs){

        Scanner sc = new Scanner(System.in);
        double averageHeight = 0;

        int n = sc.nextInt();

        double[] vect = new double[n]; // Declaração e inicialização de um vetor
        for (int i=0; i<n; i++) {
            vect[i] = sc.nextDouble();
            averageHeight += vect[i];
        }
        averageHeight /= n;
        System.out.printf("AVERAGE HEIGHT = %.2f",averageHeight);
        sc.close();

    }
}
