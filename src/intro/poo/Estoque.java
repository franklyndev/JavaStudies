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
        // product = new Produto(name, price); // Objeto iniciado com dois atributos pronto e "amount" = 0
        // product = new Produto(); // Objeto iniado com todos atibutos vazios, para atribuir depois

        // Encapsulamento
        product.setName("Computer"); // "set()", serve para modificar o atributo
        product.setPrice(850.00);


        System.out.println("Product Data: " + product.getName()); // serve para "pegar" o valor que está no atributo
        System.out.println("price: " + product.getPrice());
        System.out.println("Amount: " + product.getAmount());

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
