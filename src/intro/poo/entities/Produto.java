package intro.poo.entities;


public class Produto {

    // atributos
    public String name;
    public double price;
    public int amount;

    // Construtor vazio: atribuo depois
    public Produto (){}

    // Construtor 1: Inicializa todos os atributos com valores
    public Produto(String name, double price, int amount){
        this.name = name;
        this.price = price;
        this.amount = amount;
    }
    // Construtor 2: Inicializa os atributos "name" e "price" com valores e "amount" sem valor = 0;
    public Produto(String name, double price){
        this.name = name;
        this.price = price;
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
