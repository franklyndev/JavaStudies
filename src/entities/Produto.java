package entities;

import java.util.Scanner;

public class Produto {
    Scanner sc = new Scanner(System.in);
    // atributos
    public String name;
    public double price;
    public int amount;

    public double TotalValueInStock(){
        return price * amount;
    }

    public void AddProducts(int amount){
        this.amount += amount;
    }

    public void RemoveProducts(int amount){
        this.amount -= amount;
    }

}
