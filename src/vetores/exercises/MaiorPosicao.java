package vetores.exercises;

import java.util.Scanner;

public class MaiorPosicao {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int maiorNumero = 0;
        int posicaoMaiorNumero = 0;

        System.out.print("Quantos números você vai digitar: ");
        int n = sc.nextInt();

        int[] valores = new int[n];

        for (int i = 0; i<n; i++) {
            System.out.print("Digite um número: ");
            valores[i] = sc.nextInt();
            if (valores[i] > maiorNumero) {
                maiorNumero = valores[i];
                posicaoMaiorNumero = i;
            }
        }

        System.out.printf("MAIOR VALOR = %d%n", maiorNumero);
        System.out.printf("POSIÇÃO DO MAIOR VALOR = %d", posicaoMaiorNumero);


        sc.close();
    }
}
