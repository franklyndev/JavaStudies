package intro.poo;



import java.util.Scanner;

import static intro.poo.util.Calculator.circumference;
import static intro.poo.util.Calculator.volume;

public class CalculoDoRaioCircunferencia {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter radius: ");
        double radius = sc.nextDouble();

        double c = circumference(radius);
        double v = volume(radius);

        System.out.printf("Radius = %.2f%n", radius);
        System.out.printf("circumference = %.2f%n", c);
        System.out.printf("volume = %.2f%n", v);


        sc.close();
    }
}
