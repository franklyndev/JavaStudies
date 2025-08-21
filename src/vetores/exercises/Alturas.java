package vetores.exercises;

import vetores.exercises.classes.vetores.Dados;

import java.util.Scanner;

public class Alturas {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas: ");
        int n = sc.nextInt();


        double porcentagem = 0;
        double somaAlturas = 0;

        Dados[] vect = new Dados[n];
        for (int i = 0; i < vect.length; i++) {
            System.out.println("Dados da" + i + 1 + "ª pessoa: ");
            System.out.print("Nome: ");
            String name = sc.next();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            vect[i] = new Dados(name, idade, altura, n);
            somaAlturas += altura;

            double media = somaAlturas / n;
            System.out.print("Altura média: " + media);
            System.out.print("Pessoas com menos de 16 anos: ");

            sc.close();
        }

    }
}
