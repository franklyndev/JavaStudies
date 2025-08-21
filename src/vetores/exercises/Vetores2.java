package vetores.exercises;

import vetores.exercises.classes.vetores.ProductVet;

import java.util.Scanner;

public class Vetores2 {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ProductVet[] vect = new ProductVet[n];


        for (int i = 0; i<vect.length; i++) {
            sc.nextLine();
            String productName = sc.nextLine();
            double price = sc.nextDouble();
            vect[i] = new ProductVet(productName, price);
        }

        double sum = 0;

        for (int i = 0; i<vect.length; i++){

            sum += vect[i].getPrice();

        }
        double avg = sum / vect.length;
        System.out.printf("Average: %.2f",avg);

        sc.close();

    }
}
