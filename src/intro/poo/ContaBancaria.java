package intro.poo;

import intro.poo.entities.Banco;

import java.util.Scanner;

public class ContaBancaria {


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Banco banco;

        double balance;
        double deposit;
        double withDraw;

        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        System.out.print("Enter account holder: ");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.print("Is there a initial deposit (y/n): ");
        char answer = sc.next().charAt(0);

        System.out.println("---------------------------");
        if (answer == 'y') {
            System.out.print("Enter initial deposit value: ");
            balance = sc.nextDouble();
            System.out.println("");
            banco = new Banco(number, name, balance);
        } else {
            banco = new Banco(number, name);
        }

        System.out.println("Account data:\n" + banco);
        System.out.println("");

        System.out.print("Enter a deposit value: ");
        deposit = sc.nextDouble();
        banco.deposit(deposit);
        System.out.println("");
        System.out.println("Updated account data:\n" + banco);
        System.out.println("");
        System.out.print("Enter a withdraw value: ");
        withDraw = sc.nextDouble();
        banco.withdraw(withDraw);
        System.out.println("");
        System.out.println("Updated account data:\n" + banco);
    }
}