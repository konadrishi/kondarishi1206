public class Product {
    double price=10;


    public double getPrice() {
        return this.price;
    }

    public double setPrice() {
        return price ;
    }

    public void setPrice(double quant) {

        this.price=this.price*quant;
    }



}
