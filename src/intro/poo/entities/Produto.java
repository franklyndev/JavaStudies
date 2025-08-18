package intro.poo.entities;


public class Produto {

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

    public String toString(){
        return name + ", $" + String.format("%.2f", price) + ", " + amount + " units," + " Total = $" + String.format("%.2f", TotalValueInStock());
    }
}
