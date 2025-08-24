package vetores.exercises;

import vetores.exercises.classes.vetores.Aluguel;

import java.util.Scanner;

public class Pensionato {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("How many rooms will be rented: ");
        int rent = sc.nextInt();
        
        Aluguel[] quartos = new Aluguel[10];

        for (int i = 0; i < rent; i++) {
            sc.nextLine();
            System.out.printf("Rent #%d:%n", i+1);
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int room = sc.nextInt();
            quartos[room] = new Aluguel(name, email);
        }

        System.out.println("Busy rooms: ");
        for (int i = 0; i < quartos.length; i++) {
            if (quartos[i] != null) {
                System.out.println(i + ": " + quartos[i]);
            }
        }
        sc.close();
    }
}
