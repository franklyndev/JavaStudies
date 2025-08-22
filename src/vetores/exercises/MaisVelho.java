package vetores.exercises;

import java.util.Scanner;

public class MaisVelho {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int idadeVelha = 0;
        String nomeVelho = "";

        System.out.print("Quantas pessoas você vai digitar: ");
        int n = sc.nextInt();

        String[] nome = new String[n];
        int[] idade = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Dados da %dª pessoa: %n", i+1);
            System.out.print("Nome: ");
            nome[i] = sc.next();
            System.out.print("Idade: ");
            idade[i] = sc.nextInt();
            if (idade[i] > idadeVelha) {
                idadeVelha = idade[i];
                nomeVelho = nome[i];
            }
        }

        System.out.printf("PESSOA MAIS VELHA: %s", nomeVelho);


        sc.close();
    }
}
