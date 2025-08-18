package intro.poo;

import intro.poo.entities.AumentoDeSalário;

import java.util.Scanner;

public class Employee {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        AumentoDeSalário funcionario;
        funcionario = new AumentoDeSalário();

        System.out.print("Name: ");
        funcionario.Name = sc.nextLine();
        System.out.print("Salário bruto:");
        funcionario.SalarioBruto = sc.nextDouble();
        System.out.print("Imposto: ");
        funcionario.Tax = sc.nextDouble();

        System.out.println(funcionario);

        System.out.print("Qual a porcentagem de aumento de salário: ");
        double porcentagem = sc.nextDouble();
        funcionario.AumentarSalario(porcentagem);

        System.out.print("Updated data: " + funcionario);


    }
}
