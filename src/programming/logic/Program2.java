package programming.logic;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 5 números:");
        int[] n = new int[5];
        int soma = 0;
        for (int i = 0; i < 5; i++){
            n[i] = sc.nextInt();
            soma += n[i];
        }
        System.out.printf("SOMA = %d%n", soma);
        sc.close();
    }
}
