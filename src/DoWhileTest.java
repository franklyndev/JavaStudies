import java.util.Scanner;

public class DoWhileTest {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String resp = "";
        do{
            System.out.println("Digite a temperatura em Cº: ");
            double c = sc.nextDouble();
            double f = 9*c / 5 + 32;
            System.out.println("Equivalente em Fahrenheit: "+f);
            System.out.println("Quer continuar? (s/n)");
            resp = sc.next();
        } while (resp.equals("s"));
        sc.close();
    }
}