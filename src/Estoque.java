import entities.Produto;

import java.util.Scanner;

public class Estoque {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Produto x;
        x = new Produto();

        System.out.println("-----Replacement----- ");
        System.out.println("Enter product data:");
        System.out.print("Name: ");
        x.name = sc.next();
        System.out.print("Price: $");
        x.price = sc.nextDouble();
        System.out.print("Amount: ");
        x.amount = sc.nextInt();


        System.out.println(x);


    }
}
