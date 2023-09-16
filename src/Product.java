public class Product {
    String name;
    Integer price;

    public void priceUp(Integer n){
        this.price += n;
    }
    public void priceDown(Integer n){
        this.price -= n;
    }
}
