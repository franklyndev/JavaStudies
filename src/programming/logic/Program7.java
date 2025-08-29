package programming.logic;

import java.util.Scanner;

public class Program7 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int[][] mat = new int[4][4];
        int soma = 0;
        int somaAcimaDiagonal = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = sc.nextInt();
                soma += mat[i][j];
                if (j > i) {
                    somaAcimaDiagonal += mat[i][j];
                }
            }
        }
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j]+ " ");
            }
            System.out.println();
        }
        double media  = (double) soma / 16;
        System.out.print("SOMA = "+ soma+"\n");
        System.out.print("MÉDIA DOS ELEMENTOS = "+media+"\n");
        soma = 0;
        for (int i = 0; i < mat.length; i++) {
            soma += mat[i][i];
        }
        System.out.print("SOMA DIAGONAL PRINCIPAL = "+ soma+"\n");
        System.out.print("SOMA ACIMA DA DIAGONAL = "+ somaAcimaDiagonal);


        sc.close();
    }
}
