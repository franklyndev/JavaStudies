package intro.poo;

import intro.poo.util.CurrencyConverter;

import java.util.Scanner;


public class DolarCurrency {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price: ");
        double dolar = sc.nextDouble();
        System.out.print("How many dollars will be bought: ");
        double amountOfDollars = sc.nextDouble(); // amount of dollars u wanna buy
        System.out.printf("Amount in reais(R$) to be paid: %.2f", (CurrencyConverter.dolarConverter(dolar, amountOfDollars)));
    }
}
