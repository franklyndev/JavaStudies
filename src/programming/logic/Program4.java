package programming.logic;

import java.util.Scanner;

public class Program4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 5 números: ");
        double[] vect = new double[5];
        double soma = 0;
        for (int i = 0; i < vect.length; i++) {
            vect[i] = sc.nextDouble();
            soma += vect[i];
        }
        double media = soma / vect.length;
        System.out.print("MÉDIA = "+media);
        sc.close();
    }
}
