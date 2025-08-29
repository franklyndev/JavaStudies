package intro.poo;

import intro.poo.entities.Account;

import java.util.Scanner;

public class ProgramTreino {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);


        Account account;


        System.out.print("Enter the account number: ");
        int number = sc.nextInt();
        System.out.print("Enter account holder: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.print("Is there an initial deposit (y/n): ");
        char resp = sc.next().charAt(0);

        if (resp != 'y') {
            account = new Account(number, holder);
        } else {
            System.out.print("Enter initial deposit value: ");
            double deposit = sc.nextDouble();
            account = new Account(number, holder, deposit);

        }
        
        System.out.println("Account data: ");
        System.out.println(account);

        System.out.print("Enter a deposit value: ");
        double deposit = sc.nextDouble();
        account.deposit(deposit);

        System.out.println("Updated account data: ");
        System.out.println(account);

        System.out.println("Enter a withdraw value: ");
        double withdraw = sc.nextDouble();
        account.withdraw(withdraw);

        System.out.println("Updated account data: ");
        System.out.println(account);

        sc.close();
    }
}
