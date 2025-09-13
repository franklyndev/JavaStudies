package heranca.polimorfismo.product.exercise;

public class UsedProduct extends Product{

    private String date;

    public UsedProduct(){
        super();
    }

    public UsedProduct(String name, Double price, String date){
        super(name, price);
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    @Override
    public String toString (){
        return name + " (used) $ " + String.format("%.2f", price) + " (Manufacture date: " + date + ")";
    }
}
