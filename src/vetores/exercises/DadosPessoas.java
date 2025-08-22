package vetores.exercises;

import java.util.Scanner;

public class DadosPessoas {
    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantas pessoas serão digitadas: ");
        int n = sc.nextInt();

        double menorAltura = 10;
        double maiorAltura = 0;
        double mediaMulher;
        double somaF = 0;
        int nmulheres = 0;
        int nhomens = 0;

        double[] altura = new double[n];
        char[] genero = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Altura da %dª pessoa: ", i + 1);
            altura[i] = sc.nextDouble();
            System.out.printf("Genero da %dª pessoa: ", i + 1);
            genero[i] = sc.next().charAt(0);
            if (altura[i] > maiorAltura){
                maiorAltura = altura[i];
            }
            if (menorAltura > altura[i]) {
                menorAltura = altura[i];
            }
            if (genero[i] == 'F') {
                somaF += altura[i];
                nmulheres++;
            }
            if (genero[i] == 'M') {
                nhomens++;
            }
        }

        mediaMulher = somaF / nmulheres;

        System.out.printf("Menor altura = %.2f%n", menorAltura);
        System.out.printf("Maior altura = %.2f%n", maiorAltura);
        System.out.printf("Media da altura das mulheres = %.2f%n", mediaMulher);
        System.out.printf("Número de homens = %d", nhomens);
        sc.close();
    }
}
