package programming.logic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numeros = 0;
        int soma = 0;
        List<Integer> list = new ArrayList<>();

        System.out.print("Digite quantos números você quer: ");
        int n = sc.nextInt();
        System.out.println("Adicione:");
        for (int i = 0; i < n; i++) {
            numeros = sc.nextInt();
            soma += numeros;
            list.add(numeros);
        }
        for (Integer lista : list) {
            System.out.print(lista +" ");
        }
        System.out.println();
        System.out.print("SOMA = "+ soma);
        sc.close();
    }
}
