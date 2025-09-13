package heranca.polimorfismo.product.exercise;

public class Product {
    protected String name;
    protected Double price;

    public Product(){

    }
    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public String toString(){
        return name + " $ " + String.format("%.2f", price);
    }

}
