package vetores.exercises;

import java.util.Scanner;

public class Aprovados_RF {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos serão digitados: ");
        int n = sc.nextInt();

        String[] aluno = new String[n];
        double[] nota1 = new double[n];
        double[] nota2 = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Digite o nome, 1ª e 2ª nota do %dº aluno: %n", i+1);
            sc.nextLine();
            aluno[i] = sc.nextLine();
            nota1[i] = sc.nextDouble();
            nota2[i] = sc.nextDouble();

        }

        System.out.println("Alunos aprovados: ");
        for (int i = 0; i < n; i++) {
           double media = (nota1[i] + nota2[i]) / 2;

            if (media >= 6.0) {
                System.out.printf("%s%n", aluno[i]);
            }
        }

        sc.close();
    }

}
