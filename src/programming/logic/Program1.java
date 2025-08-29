package programming.logic;

import java.util.Scanner;

public class Program1 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 5 números: ");
        int[] n = new int[5];

        for (int i = 0; i < 5; i++){
            n[i] = sc.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            System.out.print(n[i]);
        }

        sc.close();
    }
}
