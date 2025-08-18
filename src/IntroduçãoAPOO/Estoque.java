package IntroduçãoAPOO;

import IntroduçãoAPOO.entities.Produto;

import java.util.Scanner;

public class Estoque {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Produto product;
        product = new Produto();

        System.out.println("-----Replacement----- ");
        System.out.println("Enter product data:");
        System.out.print("Name: ");
        product.name = sc.next();
        System.out.print("Price: $");
        product.price = sc.nextDouble();
        System.out.print("Amount: ");
        product.amount = sc.nextInt();


        System.out.println("Product Data: " + product);

        System.out.println("Enter the number of products to be added in stock: ");
        int amount = sc.nextInt();
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
