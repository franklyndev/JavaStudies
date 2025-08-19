package intro.poo.entities;


public class Produto {

    // atributos
    private String name;
    private double price;
    private int amount;

    public Produto() {
    }

    public Produto(String name, double price, int amount) {
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    public Produto(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
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
