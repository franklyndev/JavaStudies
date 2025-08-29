package matrizes;

import java.util.Scanner;

public class Atividade1Matriz {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] mat = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println("Diagonal principal: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    System.out.print(mat[i][j]);
                }
            }
        }
        int count = 0;
        System.out.println();
        System.out.println("Números negativos: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] < 0) {
                    System.out.print(mat[i][j]);
                    count++;
                }
            }
        }
        System.out.println();
        System.out.println("Quantidade: " + count);
        sc.close();
    }
}
