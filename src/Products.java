import intro.poo.ItemProducts;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Products {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.print("How many products will be entered: ");
        int n = sc.nextInt();

        List<ItemProducts> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.printf("Product #%d%n", i+1);
            System.out.print("Id: ");
            int id = sc.nextInt();
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            list.add(new ItemProducts(id, name, price));
        }

        System.out.print("Enter the product ID that will have discount: ");
        int productId = sc.nextInt();
        Integer pos = position(list, productId);
        if (pos == null) {
            System.out.println("Product ID not found");
        } else {
            System.out.print("Enter the discount percentage: ");
            double percentage = sc.nextDouble();
            list.get(pos).discount(percentage);

        }
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("List of products: ");
        for (ItemProducts products : list) {
            System.out.println(products);
        }

        sc.close();
    }
    public static Integer position(List<ItemProducts> list, int id){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        return null;
    }
}
