package programming.logic;

import java.util.Scanner;

public class Program5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite números da matriz 3x3: ");
        int[][] mat = new int[3][3];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println("MATRIZ DIGITADA: ");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] +" ");
            }
            System.out.println();
        }
        int soma = 0;
        System.out.print("DIAGONAL PRINCIPAL: ");
        for (int i = 0; i < mat.length; i++) {
                System.out.print(mat[i][i]+" ");
                soma += mat[i][i];
        }
        System.out.println();
        System.out.print("SOMA = "+ soma);
        sc.close();
    }
}
