package intro.poo.entities;


public class Produto {

    // atributos
    public String name;
    public double price;
    public int amount;

    // Construtor
    public Produto(String name, double price, int amount){
        this.name = name;
        this.price = price;
        this.amount = amount;
    }
    // Valor total no estoque
    public double TotalValueInStock(){
        return price * amount;
    }

    // Adicionar produtos
    public void AddProducts(int amount){
        this.amount += amount;
    }

    // Remover produtos
    public void RemoveProducts(int amount){
        this.amount -= amount;
    }

    // mostrar na tela o resultado
    public String toString(){
        return name + ", $" + String.format("%.2f", price) + ", " + amount + " units," + " Total = $" + String.format("%.2f", TotalValueInStock());
    }
}
