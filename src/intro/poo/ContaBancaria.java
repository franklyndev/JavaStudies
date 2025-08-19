package intro.poo;

import intro.poo.entities.Banco;

import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Banco banco;
        banco = new Banco();

        double balance;

        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        banco.setAccountNumber(number);
        System.out.print("Enter account holder: ");
        sc.nextLine();
        banco.name = sc.nextLine();
        System.out.print("Is there a initial deposit (y/n): ");
        char answer = sc.next().charAt(0);

        System.out.println("---------------------------");
        if (answer == 'y') {
            System.out.print("Enter initial deposit value: ");
            balance = sc.nextDouble();
            banco.setBalance(balance);
            System.out.println("");
        }

        System.out.println("Account data:\n" + banco);
        System.out.println("");

        System.out.print("Enter a deposit value: ");
        balance = sc.nextDouble();
        banco.deposit(balance);
        System.out.println("");
        System.out.println("Updated account data:\n" + banco);
        System.out.println("");
        System.out.print("Enter a withdraw value: ");
        balance = sc.nextDouble();
        banco.withdraw(balance);
        System.out.println("");
        System.out.println("Updated account data:\n" + banco);
    }
}