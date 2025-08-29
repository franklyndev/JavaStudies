package programming.logic;

import java.util.Scanner;

public class Program3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int pos = 0;


        System.out.println("Digite 5 números:");
        int[] n = new int[5];
        n[0] = sc.nextInt();
        int maior = n[0];

        for (int i = 1; i < 5; i++) {
            n[i] = sc.nextInt();
            if (maior < n[i]) {
                maior = n[i];
                pos = i;
            }
        }
        System.out.print("MAIOR = "+ maior + "\nPOSIÇÃO = " +pos);
        sc.close();
    }
}
