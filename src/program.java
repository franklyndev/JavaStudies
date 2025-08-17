import java.util.Scanner;
import entities.Triangle;

public class program {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        // Objetos
        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        // Entrada de Medidas do triangulo
        System.out.println("Enter the measure of the triangle X: ");
        x.a = sc.nextDouble(); // a, b, c são atributos da classe Triangle; cada objeto tem suas próprias instâncias(valores) desses atributos
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Enter the measure of the triangle Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();


        // área
        double areaX = x.CalculoArea();
        double areaY = y.CalculoArea();

        System.out.printf("entities.Triangle X area: %.4f%nTriangle Y area: %.4f%n", areaX, areaY);


    }
    // fórmula de P:
    public static double formulaP(double x, double y, double z){

        double resultado;
        resultado = (x + y + z) / 2;
        return resultado;

    }
}
