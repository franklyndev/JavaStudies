package vetores.exercises;

import java.util.Scanner;

public class Alturas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // variáveis
        double alturaSoma = 0;
        double alturaMedia;
        double porcentagemDeMenores = 0;

        System.out.print("Quantas pessoas serão digitadas: ");
        int n = sc.nextInt();

        // vetores
        String[] nome = new String[n];
        int[] idade = new int[n];
        double[] altura = new double[n];

        // Fazer leitura dos dados das pessoas;
        for (int i = 0; i < n; i++){
            sc.nextLine();
            System.out.printf("Dados da %sª pessoa: %n",i+1);
            System.out.print("Nome: ");
            nome[i] = sc.nextLine();
            System.out.print("Idade: ");
            idade[i] = sc.nextInt();
            System.out.print("Altura: ");
            altura[i] = sc.nextDouble();
        }
        // porcentagem de menores + soma de todas as alturas
        for (int i = 0; i < n; i++){
            if (idade[i] < 16) {
                porcentagemDeMenores++;
            }
            alturaSoma += altura[i];
        }

        porcentagemDeMenores = (porcentagemDeMenores / n) * 100;
        alturaMedia = alturaSoma / n;

        System.out.printf("Altura média: %.2f%n", alturaMedia);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%n", porcentagemDeMenores);

        for (int i = 0; i < n; i++){
            if (idade[i] < 16) {
                System.out.printf("%s%n", nome[i]);
            }
        }
        sc.close();
    }
}