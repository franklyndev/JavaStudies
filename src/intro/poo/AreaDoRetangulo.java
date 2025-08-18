package intro.poo;

import intro.poo.entities.Retangulo;

import java.util.Scanner;

public class AreaDoRetangulo {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        Retangulo retangulo = new Retangulo();

        System.out.print("Base: ");
        retangulo.base = sc.nextDouble();
        System.out.print("Altura: ");
        retangulo.altura = sc.nextDouble();

        System.out.println("Área: " + retangulo.area());
        System.out.println("Perímetro: " + retangulo.perimetro());
        System.out.println("Diagonal: " + retangulo);

    }
}
