package intro.poo;

import intro.poo.entities.Estudante;

import java.util.Scanner;

public class AprovadoOuReprovado {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        Estudante estudante = new Estudante();

        System.out.print("Nome: ");
        estudante.nome = sc.nextLine();
        System.out.print("Nota 1 = ");
        estudante.nota1 = sc.nextDouble();
        System.out.print("Nota 2 = ");
        estudante.nota2 = sc.nextDouble();
        System.out.print("Nota 3 = ");
        estudante.nota3 = sc.nextDouble();

        if (estudante.calcularNota() < 60){
            System.out.println("Reprovado!");
            System.out.println("Média era 60 você atingiu " + estudante.calcularNota());
            System.out.println("Ponto restantes = " + estudante.notaFinal());
        } else {
            System.out.println("Aprovado!");
            System.out.println("Nota final = " + estudante.calcularNota());
        }

    }
}
