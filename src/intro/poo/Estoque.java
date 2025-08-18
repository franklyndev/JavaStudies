package intro.poo;

import intro.poo.entities.Produto;

import java.util.Scanner;

public class Estoque {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Produto product;

        System.out.println("-----Replacement----- ");
        System.out.println("Enter product data:");
        System.out.print("Name: ");
        String name = sc.next();
        System.out.print("Price: $");
        double price = sc.nextDouble();
        System.out.print("Amount: ");
        int amount = sc.nextInt();
        product = new Produto(name, price, amount); // Objeto iniciado com atributos prontos, usando construtor

        System.out.println("Product Data: " + product);

        System.out.println("Enter the number of products to be added in stock: ");
        amount = sc.nextInt();
        product.AddProducts(amount);

        System.out.println("");
        System.out.println("Updated data: " + product);

        System.out.println("");
        System.out.println("Enter the number of products to be removed from stock: ");
        amount = sc.nextInt();
        product.RemoveProducts(amount);
        System.out.println("Updated data: " + product);



    }
}
