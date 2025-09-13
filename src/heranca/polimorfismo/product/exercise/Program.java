package heranca.polimorfismo.product.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        List<Product> list = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.printf("Product #%d data:%n", i+1);
            System.out.print("Common, used or imported (c/u/i): ");
            char type = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.next();
            System.out.print("Price: ");
            Double price = sc.nextDouble();
            if (type == 'i') {
                System.out.print("Customs fee: ");
                Double fee = sc.nextDouble();
                list.add(new ImportedProduct(name, price, fee));
            } else if (type == 'c') {
                list.add(new Product(name, price));
            } else if (type == 'u') {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                sc.nextLine();
                String date = sc.nextLine();
                list.add(new UsedProduct(name, price, date));
            }
        }

        System.out.println("PRICE TAGS: ");
        for (Product product : list) {
            System.out.println(product);
        }

        sc.close();
    }
}
