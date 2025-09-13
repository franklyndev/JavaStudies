package heranca.polimorfismo.product.exercise;

public class ImportedProduct extends Product{
    // atributos
    private Double fee;

    public ImportedProduct(){
        super();
    }
    public ImportedProduct(String name, Double price, Double fee){
        super(name, price);
        this.fee = fee;
    }

    public Double getFee() {
        return fee;
    }

    public void setFee(Double fee) {
        this.fee = fee;
    }

    public Double totalPrice(){
        return price += fee;
    }
    @Override
    public String toString (){
        return name + " $ " + totalPrice() + " (Customs fee: $ " + String.format("%.2f",fee) + ")";
    }
}
